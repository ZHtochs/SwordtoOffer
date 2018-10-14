package swordtoOffer.question40_49;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-09 21:47
 **/
public class isContinuous_45 {
    public static boolean isContinuous(int[] numbers) {
        if (numbers.length > 13 || numbers.length==0)
            return false;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            arrayList.add(numbers[i]);
        }
//        Arrays.sort(numbers);
        Collections.sort(arrayList);
        int length=arrayList.size();
        int number = 0;
        for (int i=0;i<arrayList.size();i++) {
            if (arrayList.get(i) == 0 && arrayList.get(i+1) != 0) {
                number=i+1;
            }
            if(i+1<length && arrayList.get(i) != 0 && arrayList.get(i+1) == arrayList.get(i)){
                return false;
            }
        }
        if(arrayList.get(length-1)-arrayList.get(number)+1==length-number){
            return true;
        }
        if(arrayList.get(length-1)-arrayList.get(number)+1-(length-number)<=number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] a={1,0,0,1,0};
        System.out.println(isContinuous(a));
    }
}