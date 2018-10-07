package swordtoOffer;

import java.util.ArrayList;

/**
 * 深度搜索
 *
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-06 15:25
 **/
public class FindPath_24 {
    ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        if (root == null) {
            return arrayLists;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(root.val);
        findSinglePath(root, root.val, target, arrayList);
        return arrayLists;
    }
    public void findSinglePath(TreeNode node, int sum, int target, ArrayList<Integer> arrayList) {
        if (sum != target) {
            if (node.left != null) {
                ArrayList<Integer> r = (ArrayList<Integer>) arrayList.clone();
                r.add(node.left.val);
                findSinglePath(node.left, sum + node.left.val, target, r);
            }
            if (node.right != null) {
                ArrayList<Integer> r = (ArrayList<Integer>) arrayList.clone();
                r.add(node.right.val);
                findSinglePath(node.right, sum + node.right.val, target, r);
            }
        } else if (sum == target) {
            if (node.left == null && node.right == null) {
                arrayLists.add((ArrayList<Integer>) arrayList.clone());
            }
        }

    }


}