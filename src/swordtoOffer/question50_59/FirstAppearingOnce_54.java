package swordtoOffer.question50_59;

import java.util.LinkedList;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 *
 * 思路：时间复杂度O（1），空间复杂度O（n）
 1、用一个128大小的数组统计每个字符出现的次数
 2、用一个队列，如果第一次遇到ch字符，则插入队列；其他情况不在插入
 3、求解第一个出现的字符，判断队首元素是否只出现一次，如果是直接返回，否则删除继续第3步骤

 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-11 23:03
 **/
public class FirstAppearingOnce_54 {
    //Insert one char from stringstream
    int[] number = new int[256];
    LinkedList<Character> queue = new LinkedList<>();

    public void Insert(char ch) {

        if (number[ch] == 0) {
            queue.offer(ch);
        }
        number[ch]++;
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        char c;
        while (!queue.isEmpty()) {
            c = queue.peek();
            if (number[c] == 1)
                return c;
            else
                queue.poll();
        }
        return '#';
    }

    public static void main(String[] args) {
        FirstAppearingOnce_54 f = new FirstAppearingOnce_54();
        f.Insert('g');
        System.out.print(f.FirstAppearingOnce());
        f.Insert('0');
        System.out.print(f.FirstAppearingOnce());
        f.Insert('0');
        System.out.print(f.FirstAppearingOnce());
        f.Insert('g');
        System.out.print(f.FirstAppearingOnce());
        f.Insert('l');
        System.out.print(f.FirstAppearingOnce());
        f.Insert('e');
        System.out.print(f.FirstAppearingOnce());
    }
}