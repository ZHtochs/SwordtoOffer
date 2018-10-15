package swordtoOffer.question50_59;

import swordtoOffer.constructure.ListNode;

import java.util.List;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 *
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-14 15:02
 **/
public class deleteDuplication_56 {
    public static ListNode deleteDuplication(ListNode pHead) {

        ListNode first =new ListNode(0);//设置一个trick

        first.next = pHead;

        ListNode p = pHead;
        ListNode last = first;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                int val = p.val;
                while (p!= null&&p.val == val)
                    p = p.next;
                last.next = p;
            } else {
                last = p;
                p = p.next;
            }
        }
        return first.next;
    }
}