package Week2;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = null;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if(stack.size() == 0){
            return (Integer) null;
        }else{
            int min = Integer.MAX_VALUE;
            for(int i : stack){
                if(i<min){
                    min = i;
                }
            }
            return min;
        }
    }
}