package swordtoOffer.question60_69;

import swordtoOffer.constructure.TreeNode;

import java.util.ArrayList;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-15 14:48
 **/
public class Serialize_61 {
    String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if(root == null){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        if (str.length()==0)
            return null;
        String[] strings=str.split(",");
        TreeNode node=Deserialize(strings,0);
        return node;

    }
    TreeNode Deserialize(String[] str,int root) {
        if (root>=str.length || str[root]=="#")
            return null;
        TreeNode node =new TreeNode(Integer.parseInt(str[root]));
        node.left=Deserialize(str,2*root+1);
        node.right=Deserialize(str,2*root+2);
        return node;

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
//        String  s = new Serialize_61().Serialize(node1);
//        String str="1,2,4,#,#,5,#,#,3,6,#,#,7,#,#,";
        String str="1,2,";
        TreeNode node=new Serialize_61().Deserialize(str);
        String  s = new Serialize_61().Serialize(node);
        System.out.println(s);
    }
}