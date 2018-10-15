package swordtoOffer.question60_69;

import swordtoOffer.constructure.TreeNode;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 *
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-15 15:13
 **/
public class KthNode_62 {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot==null || k==0)
            return null;
        PriorityQueue<TreeNode> priorityQueue=new PriorityQueue<>(k, new Comparator<TreeNode>() {
            @Override
            public int compare(TreeNode o1, TreeNode o2) {
                Integer integerO2=(Integer)o2.val;
                return (Integer) integerO2.compareTo(o1.val);
            }
        });
        LinkedList<TreeNode> queue=new LinkedList<>();
        int count=0;
        queue.offer(pRoot);
        while (!queue.isEmpty()){
            TreeNode temp=queue.poll();
            count++;
            if (priorityQueue.size()!=k)
                priorityQueue.offer(temp);
            else if (temp.val<priorityQueue.peek().val)
            {
                priorityQueue.poll();
                priorityQueue.offer(temp);
            }
            if (temp.left!=null)
                queue.offer(temp.left);
            if (temp.right!=null)
                queue.offer(temp.right);
        }
        if (count<k)
            return null;

        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(8);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        KthNode_62 kthNode_62=new KthNode_62();
        TreeNode node =kthNode_62.KthNode(node1,3);
        System.out.println(node.val);
    }

}