package swordtoOffer;

import java.util.LinkedList;
import java.util.Queue;

/**输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-08 21:39
 **/
public class TreeDepth_38 {
    public int TreeDepth(TreeNode root) {
        if (root==null){
            return  0;
        }
        int rightDepth=TreeDepth(root.right);
        int leftDepth=TreeDepth(root.left);
        return (rightDepth>leftDepth?rightDepth:leftDepth)+1;
    }
    public int TreeDepth2(TreeNode root){
        if (root==null)
            return 0;
        Queue<TreeNode> queue=new LinkedList<>() ;
        int depth=0,width=0,maxWidth=0;
        queue.offer(root);
        while (queue.size()!=0){
            width=queue.size();
            depth++;
            if(width>maxWidth){
                maxWidth=width;
            }
            for (int i=0;i<width;i++){
                TreeNode treeNode=queue.peek();
                queue.poll();
                if (treeNode.left!=null){
                    queue.offer(treeNode.left);
                }
                if (treeNode.right!=null){
                    queue.offer(treeNode.right);
                }
            }
        }
        return depth;
    }
}