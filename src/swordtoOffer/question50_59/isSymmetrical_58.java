package swordtoOffer.question50_59;

import swordtoOffer.constructure.TreeNode;

import java.util.LinkedList;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 *
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-14 22:02
 **/
public class isSymmetrical_58 {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        return judge(pRoot.left, pRoot.right);
    }

    boolean judge(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val == right.val) {
            return judge(left.left, right.right) && judge(left.right, right.left);
        } else return false;
    }

    boolean isSymmetrical2(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        LinkedList<TreeNode> left = new LinkedList<>();
        LinkedList<TreeNode> right = new LinkedList<>();
        left.add(pRoot.left);
        right.add(pRoot.right);
        while (!left.isEmpty() && !right.isEmpty()) {
            TreeNode leftNode=left.pop();
            TreeNode rightNode=right.pop();;
            //两边都空
            if (leftNode==null && rightNode==null)
                continue;
            //一边空一遍不空
            if (leftNode==null || rightNode==null)
                return false;
            //都不空并且值不相同
            if (leftNode.val!=rightNode.val)
                return false;
            left.push(leftNode.left);
            left.push(leftNode.right);
            right.push(rightNode.right);
            right.push(rightNode.left);
        }
        return true;

    }
}