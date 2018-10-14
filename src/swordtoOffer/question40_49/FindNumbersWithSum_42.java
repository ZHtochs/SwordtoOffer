package swordtoOffer.question40_49;

import java.util.ArrayList;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-09 20:49
 **/
public class FindNumbersWithSum_42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int i = 0,j=array.length-1;
        for (; i < j; ) {
            if(array[i]+array[j]>sum)
                j--;
            if(array[i]+array[j]<sum)
                i++;
            if(array[i]+array[j]==sum){
                arrayList.add(array[i]);
                arrayList.add(array[j]);
                return arrayList;
            }

        }
        return arrayList;
    }
}