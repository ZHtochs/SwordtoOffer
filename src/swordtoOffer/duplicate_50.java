package swordtoOffer;

import java.util.HashSet;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-09 23:45
 **/
public class duplicate_50 {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (!hashSet.add(numbers[i])){
                duplication[0] =numbers[i];
                return true;
            }
        }
        return false;
    }
}