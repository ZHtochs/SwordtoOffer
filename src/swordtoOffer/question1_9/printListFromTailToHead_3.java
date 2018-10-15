package swordtoOffer.question1_9;

import swordtoOffer.constructure.ListNode;

import java.util.ArrayList;
/*输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。*/

public class printListFromTailToHead_3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> it=new ArrayList<>();
        while(listNode.next!=null){
            it.add(0,listNode.val);
            listNode=listNode.next;
        }
        return  it;
    }
}
