package Week3;

import java.util.Stack;

public class ValidParenthesisString {
    public static void main(String[] args) {
        String str = "((()))()(())(*()()())**(())()()()()((*()*))((*()*)";
        boolean result = checkValidString(str);
        System.out.println(result);
    }

    public static boolean checkValidString(String s) {
        boolean result = false;
        int countOpen = 0;
        int countClose = 0;
        int countStar = 0;
        int remainOpen = 0;
        int remainClose = 0;
        int remainStar = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push('(');
                    remainOpen++;
                    countOpen++;
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '(' || stack.peek() == '*') {
                        remainClose--;
                        countClose++;
                        if (stack.pop() == '*') {
                            remainStar--;
                        } else {
                            remainOpen--;
                        }
                    } else {
                        return result;
                    }
                    break;
                case '*':
                    remainStar++;
                    countStar++;
                    stack.push('*');
                    break;
            }
        }
        if (stack.empty()) {
            result = true;
        } else {
            if (countOpen == countClose || 
            countOpen + countStar == countClose || 
            countOpen == countClose + countStar
                    ||  remainOpen <= remainStar
                    ) {
                result = true;
            }
        }
        return result;
    }
}