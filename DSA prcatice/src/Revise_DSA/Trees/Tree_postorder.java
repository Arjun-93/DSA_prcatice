package Revise_DSA.Trees;
import java.util.*;

public class Tree_postorder {

    public static void postorder(TreeNode root){
        if (root == null){
            return;
        }
        else{
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static TreeNode helper(int[] A, int bound, int[] i) {
        if (i[0] == A.length || A[i[0]] > bound) return null;
        TreeNode root = new TreeNode(A[i[0]++]);
        root.left = helper(A, root.val, i);
        root.right = helper(A, bound, i);
        return root;
    }

    public static void main(String[] args) {
        int num, item, A[];
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        input.nextLine();
        A = new int[num];
        String s[] = input.nextLine().split(" ");
        for (int i = 0 ; i < s.length; i++) {
            A[i] = Integer.parseInt(s[i]);
        }
        TreeNode root = helper(A, Integer.MAX_VALUE, new int[]{0});
        postorder(root);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

