package swordtoOffer.question20_29;

import swordtoOffer.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**层序遍历
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-05 22:49
 **/
public class PrintFromTopToBottom_22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        if (root==null)
            return arrayList;
        Queue<TreeNode> queue=new LinkedList<>() ;

        queue.add(root);
//        arrayList.add(root.val);
        while (!queue.isEmpty()){
            TreeNode temp=queue.poll();
            arrayList.add(temp.val);
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
        return arrayList;
    }
}