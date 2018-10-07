package swordtoOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-07 09:00
 **/
public class MoreThanHalfNum_28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map=new HashMap<>();
        boolean flag=true;
        for (int i = 0; i <array.length ; i++) {
            if(map.containsKey(array[i])){
                int now=map.get(array[i]);
                now++;
                map.put(array[i],now);
            }else {
                map.put(array[i],1);
            }
        }
        for (Integer s:map.keySet()){
            System.out.println(s+":"+map.get(s));
            if(map.get(s)>((double)array.length)/2){
                return s;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        MoreThanHalfNum_28 moreThanHalfNum_28=new MoreThanHalfNum_28();
        int[] a={4,2,1,4,2,4};
        System.out.println(moreThanHalfNum_28.MoreThanHalfNum_Solution(a));
    }
}