package swordtoOffer.question10_19;
/*输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
* */
import swordtoOffer.entity.ListNode;

public class mergeList_16 {

    public static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode head1 = list1.val > list2.val ? list2 : list1;
        ListNode head2 = list1.val > list2.val ? list1 : list2;


        while (head1 != null) {
            ListNode next1 = head1.next;
            if (head2 != null) {
                ListNode next2 = head2.next;
                if (head2.val >= head1.val) {
                    head1.next = head2;
                    head2.next = next1;
                }
                head2 = next2;
            }
            head1 = next1;
        }
        return list1;

    }
}
