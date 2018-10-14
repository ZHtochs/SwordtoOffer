package swordtoOffer.question20_29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-07 10:13
 **/
public class GetLeastNumbers_29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(k>input.length){
            return arrayList;
        }
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        for (Integer i:input
             ) {priorityQueue.add(i);
        }
        for (int i=0;i<k && i<input.length;i++){
            arrayList.add(priorityQueue.remove());
        }
        System.out.println(arrayList);
        return arrayList;
    }

    public static void main(String[] args) {
        GetLeastNumbers_29 getLeastNumbers_29=new GetLeastNumbers_29();
        int[] a={4,5,1,6,2,7,3,8};
        getLeastNumbers_29.GetLeastNumbers_Solution(a,4);
    }
}