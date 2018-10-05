package swordtoOffer;

import java.util.ArrayList;


public class swordOffer3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> it=new ArrayList<>();
        while(listNode.next!=null){
            it.add(0,listNode.val);
            listNode=listNode.next;
        }
        return  it;
    }
}
