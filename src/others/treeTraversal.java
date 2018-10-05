package others;

import java.util.LinkedList;
import java.util.Queue;

public class treeTraversal {
   class Node {
       int val;
       Node left;
       Node right;
       Node(int x) {
           val = x;
       }
   }

    private static void preorder(int a[], int root) {
        if (a == null || root>=a.length)
            return;

        System.out.print(a[root]);
        preorder(a, 2 * root);
        preorder(a, root * 2 + 1);
    }
    private static void middleorder(int a[], int root) {
        if (a == null || root>=a.length)
            return;
        preorder(a, 2 * root);
        System.out.print(a[root]);

        preorder(a, root * 2 + 1);
    }
    private static void postorder(int a[], int root) {
        if (a == null || root>=a.length)
            return;
        preorder(a, 2 * root);
        preorder(a, root * 2 + 1);
        System.out.print(a[root]);


    }
    /**
     *
     *  root 树根节点
     * 层序遍历二叉树，用队列实现，先将根节点入队列，只要队列不为空，然后出队列，并访问，接着讲访问节点的左右子树依次入队列
     */
    public static void levelTravel(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp =  q.poll();
            System.out.println(temp.val);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
    }



    public static void main(String[] args) {
        int a[] = {0,1, 2, 3, 4, 5, 6, 7};
        preorder(a, 1);
        System.out.println();
        middleorder(a, 1);
        System.out.println();
        postorder(a,1);
    }
}
