package swordtoOffer.question10_19;

public class ReverseList_15 {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode now = head;
        while (now != null) {
            ListNode next=now.next;
            now.next=pre;
            pre=now;
            now=next;
        }
        return pre;
    }

}
