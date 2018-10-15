package swordtoOffer.question60_69;

import swordtoOffer.constructure.TreeNode;
import swordtoOffer.question50_59.PrintZ_59;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-15 14:35
 **/
public class Print_60 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (pRoot == null) {
            return arrayLists;
        }
        LinkedList<TreeNode> stack1 = new LinkedList<>();//存放奇数层
        stack1.push(pRoot);
        LinkedList<TreeNode> stack2 = new LinkedList<>();//存放偶数层
        int layer = 1;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (layer % 2 != 0) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!stack1.isEmpty()) {
                    TreeNode node = stack1.poll();
                    if (node != null) {
                        arrayList.add(node.val);
                        temp.add(node.val);
                        stack2.offer(node.left);
                        stack2.offer(node.right);
                    }

                }
                if (!temp.isEmpty()) {
                    arrayLists.add(temp);
                    layer++;
                }
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!stack2.isEmpty()) {
                    TreeNode node = stack2.poll();
                    if (node != null) {
                        arrayList.add(node.val);
                        temp.add(node.val);
                        stack1.offer(node.left);
                        stack1.offer(node.right);

                    }
                }
                if (!temp.isEmpty()) {
                    arrayLists.add(temp);
                    layer++;
                }
            }
        }
        System.out.println(arrayList);
        return arrayLists;
    }
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        ArrayList<ArrayList<Integer>> arrayList = new Print_60().Print(node1);
        System.out.println(arrayList);
    }

}