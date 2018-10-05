package swordtoOffer;

import java.util.LinkedList;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-05 17:46
 **/
public class MinStack_20 {
    LinkedList<Integer> linkedList = new LinkedList<>();
    LinkedList<Integer> assit = new LinkedList<>();

    public void push(int node) {
        int min;
        if (linkedList.peek() == null) {
            min = node;
            assit.push(node);
            linkedList.push(node);
        } else {
            min = assit.peek();
            if (node > min) {
                linkedList.push(node);
                assit.push(min);
            } else {
                linkedList.push(node);
                assit.push(node);
            }
        }

    }

    public void pop() {
        assit.pop();
        linkedList.pop();
    }

    public int top() {
        return linkedList.peek();

    }

    public int min() {
//        System.out.println(assit.peek());
        return assit.peek();
    }

    public static void main(String[] args) {
        MinStack_20 m = new MinStack_20();
        m.push(3);
        m.min();
        m.push(4);
        m.min();
        m.push(2);
        m.min();
        m.push(3);
        m.min();
        m.pop();
        m.min();
        m.pop();
        m.min();
        m.pop();
        m.min();
        m.push(0);
        m.min();
    }
}