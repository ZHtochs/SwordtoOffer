package swordtoOffer.question20_29;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-06 22:23
 **/
public class Permutation_27 {
     Set<String> set = new TreeSet<>();
     ArrayList<String> arrayList = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        char[] chars = str.toCharArray();
        System.out.println(chars);
        swapString(chars, 0);
        for (String s : set
                ) {
            arrayList.add(s);

        }
        return arrayList;
    }

    public void swapString(char[] chars, int start) {
        if (start == chars.length) {
            return;
        }
        for (int i = start; i < chars.length; i++) {

            swap(chars, start, i);
            set.add(String.copyValueOf(chars));
            swapString(chars, start + 1);
            swap(chars, start, i);

        }
    }

    public void swap(char[] chars, int i, int j) {
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }


}