package swordtoOffer;

import java.util.LinkedList;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-05 21:50
 **/
public class IsPopOrder_21 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        LinkedList<Integer> s = new LinkedList<>();
        int popIndex = 0;
        for (int i = 0; i < pushA.length; i++) {
            s.push(pushA[i]);
            //如果栈不为空，且栈顶元素等于弹出序列
            while (!s.isEmpty() && s.peek() == popA[popIndex]) {
                //出栈
                s.pop();
                //弹出序列向后一位
                popIndex++;
            }
        }
        return s.isEmpty();
    }
}