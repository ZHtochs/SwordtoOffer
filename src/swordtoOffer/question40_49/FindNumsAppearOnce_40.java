package swordtoOffer.question40_49;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-09 15:30
 **/
public class FindNumsAppearOnce_40 {
    public static  void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        HashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            if(set.contains(array[i]))
                set.remove(array[i]);
            else
                set.add(array[i]);
        }
        Iterator<Integer> it=set.iterator();
        int flag=0;
        while (it.hasNext()){
            if(flag==0){
                num1[0]=it.next();
                flag=1;
            }
            if (flag==1){
                num2[0]=it.next();
            }
        }
    }

    public static void main(String[] args) {
        int[] a={2,4,3,6,3,2,5,5};
        int[] num1={1};
        int[] num2={2};
        FindNumsAppearOnce(a,num1,num2);
    }
}