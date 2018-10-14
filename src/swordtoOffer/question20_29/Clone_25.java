package swordtoOffer.question20_29;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-06 17:22
 **/
public class Clone_25 {
    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead){
        if(pHead==null){
            return null;
        }
        RandomListNode now=pHead;
        RandomListNode next=now;
        //插入复制节点
        while (next!=null){
            next=next.next;
            RandomListNode insert=new RandomListNode(now.label);
            now.next=insert;
            insert.next=next;
            now=next;

        }
        //回到头结点，复制随机指针
        now=pHead;
        next=now;
        while (next!=null){
            next.next.random=(next.random==null?null:next.random.next);//next.next必不为空，因为上一步起码复制了一个节点
            if(next.next.next==null){
                break;
            }
            else {
                next=next.next.next;
            }
        }
        //拆分
        RandomListNode newHead=pHead.next;

        now=pHead;
        next=newHead;
        while (next!=null){
            now.next=next.next;
            now=now.next;
            if(now==null){
                next.next=null;
                next=next.next;
            }else {
                next.next=now.next;
                next=next.next;
            }
        }
        return newHead;
    }

    public static void main(String[] args) {
        RandomListNode Node1=new RandomListNode(1);
        RandomListNode Node2=new RandomListNode(2);
        Node1.random=Node2;
        Node1.next=Node2;
        Clone_25 clone=new Clone_25();
        clone.Clone(Node1);

    }
}