package swordtoOffer.question20_29;

import swordtoOffer.entity.TreeNode;

/**输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-06 21:46
 **/
public class Convert_26 {
    TreeNode head = null;
    TreeNode realHead = null;
    public TreeNode Convert(TreeNode pRootOfTree){
        ConvertSub(pRootOfTree);
        return realHead;

    }
    public TreeNode ConvertSub(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        ConvertSub(pRootOfTree.left);
        if(head==null){
            head=pRootOfTree;
            realHead=head;//realHead只执行一次，因此readHead必定是最左边的一个节点
        }else {
            head.right = pRootOfTree;
            pRootOfTree.left = head;
            head = pRootOfTree;//移到下一个(中序遍历顺序的）节点
        }
        ConvertSub(pRootOfTree.right);
        return realHead;
    }
}