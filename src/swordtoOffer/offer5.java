package swordtoOffer;

import java.util.Arrays;
import java.util.Stack;

public class offer5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()){
            int temp=stack1.pop();
            stack2.push(temp);
        }
        int outRes=stack2.pop();
        while (!stack2.isEmpty()){
            int temp=stack2.pop();
            stack1.push(temp);
        }
        return outRes;
    }
}
