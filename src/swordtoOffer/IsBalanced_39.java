package swordtoOffer;

import java.util.LinkedList;
import java.util.Queue;

/**输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-09 11:08
 **/
public class IsBalanced_39 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root==null)
            return true;
        if(TreeDepth(root.left)==TreeDepth(root.right) || TreeDepth(root.left)-TreeDepth(root.right)==1 )
            return true;
        else
            return false;
    }
    private int TreeDepth(TreeNode root){
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