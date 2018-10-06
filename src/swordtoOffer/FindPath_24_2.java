package swordtoOffer;

import java.util.ArrayList;

/**
 * 深度搜索
 *
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-06 15:25
 **/
public class FindPath_24_2 {
    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return lists;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();

        findSinglePath(root, root.val, target, arrayList);
        return lists;
    }

    public void findSinglePath(TreeNode node, int sum, int target, ArrayList<Integer> arrayList) {
        if (node==null)
            return;
        sum+=node.val;
        if(sum==target){
            if(node.left==null && node.right==null){
                arrayList.add(node.val);
                lists.add((ArrayList<Integer>) arrayList.clone());
                arrayList.remove(arrayList.size()-1);//退回上一个节点
            }
        return;
        }
        arrayList.add(node.val);
        findSinglePath(node.left,sum,target,arrayList);
        findSinglePath(node.right,sum,target,arrayList);
        arrayList.remove(arrayList.size()-1);
    }

}