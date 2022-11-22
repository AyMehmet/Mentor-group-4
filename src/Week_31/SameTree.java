package Week_31;

import java.util.ArrayDeque;

public class SameTree {

    public static void main(String[] args) {

        TreeNode firstTreeRoot = new TreeNode(10);
        firstTreeRoot.left = new TreeNode(4);
        firstTreeRoot.right = new TreeNode(15);
        firstTreeRoot.left.left = new TreeNode(3);
        firstTreeRoot.left.right = new TreeNode(5);

        TreeNode secondTreeRoot = new TreeNode(10);
        secondTreeRoot.left = new TreeNode(4);
        secondTreeRoot.right = new TreeNode(15);
        secondTreeRoot.left.left = new TreeNode(3);
        secondTreeRoot.left.right = new TreeNode(5);

        System.out.println(isSameTree(firstTreeRoot, secondTreeRoot));
        System.out.println(isSameTree2(firstTreeRoot, secondTreeRoot));


    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        // p and q are both null
        if (p == null && q == null) return true;

        // one of p and q is null
        if (q == null || p == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }






    // Second solution
    public static boolean check(TreeNode p, TreeNode q) {
        // p and q are null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        if (p.val != q.val) return false;
        return true;
    }

    public static boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (!check(p, q)) return false;

        // init deques
        ArrayDeque<TreeNode> deqP = new ArrayDeque<TreeNode>();
        ArrayDeque<TreeNode> deqQ = new ArrayDeque<TreeNode>();
        deqP.addLast(p);
        deqQ.addLast(q);

        while (!deqP.isEmpty()) {
            p = deqP.removeFirst();
            q = deqQ.removeFirst();

            if (p != null) {
                // in Java nulls are not allowed in Deque
                if (!check(p.left, q.left)) return false;
                if (p.left != null) {
                    deqP.addLast(p.left);
                    deqQ.addLast(q.left);
                }
                if (!check(p.right, q.right)) return false;
                if (p.right != null) {
                    deqP.addLast(p.right);
                    deqQ.addLast(q.right);
                }
            }
        }
        return true;
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
