package swordtoOffer.question50_59;

import swordtoOffer.constructure.ListNode;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-11 23:33
 **/
public class EntryNodeOfLoop_55 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead==null|| pHead.next==null|| pHead.next.next==null)
            return null;
        ListNode p1=pHead;
        ListNode p2=pHead;


        while (p1.next!=null && p2.next.next!=null){
            p1=p1.next;
            p2=p2.next.next;
            if (p1==p2){
                p1=pHead;
                while (p1!=p2){
                    p1=p1.next;
                    p2=p2.next;
                }
                return p1;
            }
        }

        return null;
    }
}