package week_30;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tree_InOrder {

    static  List<Integer> list= new ArrayList<>();

     /*
    94. Binary Tree Inorder Traversal
    Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]

Constraints:
    The number of nodes in the tree is in the range [0, 100].
    -100 <= Node.val <= 100

Follow up: Recursive solution is trivial, could you do it iteratively?
     */

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);

        System.out.println(inorderTraversal(root));
        System.out.println(inorderTraversal1(root));
        System.out.println(withIteration(root));
    }

    static List<Integer> withIteration(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                list.add(current.val);  // System.out.print(root.value + ", ");
                current = current.right;
            }
        }
        return list;
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return helper(root, list);
    }

    private static List<Integer> helper(TreeNode root, List<Integer> list) {
        if (root == null) return list;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
        return list;
    }

    static List<Integer> inorderTraversal1(TreeNode root){
        if (root==null) return list;
        inorderTraversal1(root.left);
        list.add(root.val);
//        System.out.print(root.value+", ");
        inorderTraversal1(root.right);
        return list;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
