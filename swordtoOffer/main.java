package swordtoOffer;

public class main {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(3);
        l1.next=l2;
        l2.next=null;
        ListNode l3=new ListNode(2);

        ListNode l4=new ListNode(4);
        l3.next=l4;
        l4.next=null;
        ListNode z=mergeList.Merge(l1,l3);
        while (z!=null){
            System.out.println(z.val);
            z=z.next;
        }
    }
}
