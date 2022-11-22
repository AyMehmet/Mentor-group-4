package Week_31;

import java.util.LinkedList;
import java.util.Stack;

public class RangeSumOfBST {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        System.out.println(rangeSumBST(root,7,15));
        System.out.println(rangeSumBSTRecursive(root,7,15));

    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        int ans = 0;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (low <= node.val && node.val <= high)
                    ans += node.val;
                if (node.val > low)
                    stack.push(node.left);
                if (node.val < high)
                    stack.push(node.right);
            }
        }
        return ans;
    }

    private static int answer;

    public static int rangeSumBSTRecursive(TreeNode root, int low, int high) {
        answer = 0;
        dfs(root, low, high);
        return answer;
    }

    public static void dfs(TreeNode node, int low, int high) {
        if (node != null) {
            if (low <= node.val && node.val <= high)
                answer += node.val;
            if (node.val > low)
                dfs(node.left, low, high);
            if (node.val < high)
                dfs(node.right, low, high);
        }
    }


    // recursive
    // DFS - post order
    // Time: O(n), space: O(h), where n is the number of total nodes, h is the height of the tree..
    static int rangeSumBST1(TreeNode root, int low, int high) {
        if (root == null) return 0; // base case.
        if (root.val < low) return rangeSumBST1(root.right, low, high); // left branch excluded.
        if (root.val > high) return rangeSumBST(root.left, low, high); // high branch excluded.
        return root.val + rangeSumBST1(root.right, low, high) + rangeSumBST1(root.left, low, high); // count in both children.
    }
    // recursive
    // DFS - post order
    // Time: O(n), space: O(h), where n is the number of total nodes, h is the height of the tree..
    public int rangeSumBST3(TreeNode root, int L, int R) {
        if (root == null) { return 0; }
        int sum = 0;
        if (root.val > L) { sum += rangeSumBST3(root.left, L, R); } // left child is a possible candidate.
        if (root.val < R) { sum += rangeSumBST3(root.right, L, R); } // right child is a possible candidate.
        if (root.val >= L && root.val <= R) { sum += root.val; } // count root in.
        return sum;
    }

    // recursive
    // DFS - post order
    // Time: O(n), space: O(h), where n is the number of total nodes, h is the height of the tree..
    public int rangeSumBST2(TreeNode root, int L, int R) {
        if (root == null) return 0; // base case.
        return (L <= root.val && root.val <= R ? root.val : 0) + rangeSumBST2(root.right, L, R) + rangeSumBST2(root.left, L, R);
    }

    // BFS traversal - level order
    static int withQueue(TreeNode root, int low, int high) {
        int result = 0;
        if (root == null) return result;
        LinkedList<TreeNode> q = new LinkedList<>();
        TreeNode current = root;
        while (!q.isEmpty() || current != null) {
            if (current != null) {
                int n = current.val;
                if (n >= low && n <= high){
                    result += n;
                }
                if (n > low ) q.push(current.left);
                if (n < high) q.push(current.right);
            }
            current = q.pop();
        }
        return result;
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
