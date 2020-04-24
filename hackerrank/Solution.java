package hackerrank;
import java.util.*;
import java.util.Scanner;

class Parser{
    boolean isBalanced(String str){
        boolean result = true;
        if(str.length() == 0 ){
            return result;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            switch(c){
                case '(':
                stack.push(c);
                break;
                case ')':
                if(stack.size()==0){
                    return false;
                }
                if(stack.peek()=='('){
                    stack.pop();
                }else{
                    result = false;
                    return result;
                }
                break;
                case '{':
                stack.push(c);
                break;
                case '}':
                if(stack.size()==0){
                    return false;
                }
                if(stack.peek()=='{'){
                    stack.pop();
                }else{
                    result = false;
                    return result;
                }
                break;
                default:
                break;
            }
        }
        if(stack.size()>0){
        result = false;
        }
        return result;
    }
}
// Write your code here. DO NOT use an access modifier in your class declaration.
class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}
}
