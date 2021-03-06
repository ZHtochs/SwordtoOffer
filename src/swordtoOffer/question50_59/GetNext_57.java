package swordtoOffer.question50_59;

import swordtoOffer.constructure.TreeLinkNode;

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 *
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-14 16:50
 **/
public class GetNext_57 {
    TreeLinkNode GetNext(TreeLinkNode node) {
        if (node == null) return null;
        if (node.right != null) {    //如果有右子树，则找右子树的最左节点
            node = node.right;
            while (node.left != null) node = node.left;
            return node;
        }
        while (node.next != null) { //没右子树，则找第一个当前节点是父节点左孩子的节点
            if (node.next.left == node) return node.next;
            node = node.next;
        }
        return null;   //退到了根节点仍没找到，则返回null
    }
}