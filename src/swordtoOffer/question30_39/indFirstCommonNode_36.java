package swordtoOffer.question30_39;

import swordtoOffer.constructure.ListNode;

/**输入两个链表，找出它们的第一个公共结点。
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-08 15:02
 **/
public class indFirstCommonNode_36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode node1=pHead1;
        ListNode node2=pHead2;
        while (node1!=node2){
            node1=(node1==null?pHead2:node1.next);
            node1=(node1==null?pHead2:node2.next);
        }
        return node1;
    }
}