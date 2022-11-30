package week_32.lca.solution;



public class LowestCommonAncestor {

    public static void main(String[] args) {
        TreeNode root = null, p = null, q = null;

        //region sample1
        System.out.println("********** EXAMPLE 1 INPUT TREE **********");
        root = getSampleTreeNode1(); //root=13
        p = root.left; //p=5
        q = root.right; //q=16
        VisualizeTree.printTree(root, null, false);
        System.out.println("INPUTS: root node => " + root.val + " p=> " + p.val + " q=> " + q.val + " expected output => 13");

        System.out.println("1) Iterative Solution Output => " + iterativeSolution(root, p, q).val);
        System.out.println("2) Recursive Solution Output => " + recursiveSolution(root, p, q).val);
        System.out.println("\n***************************************************\n");
        //endregion

        //region sample2
        System.out.println("********** EXAMPLE 2 INPUT TREE **********");
        root = getSampleTreeNode1(); //root=13
        p = root.right; //p=16
        q = root.right.left; //q=14
        VisualizeTree.printTree(root, null, false);
        System.out.println("INPUTS: root node => " + root.val + " p=> " + p.val + " q=> " + q.val + " expected output => 16");

        System.out.println("1) Iterative Solution Output => " + iterativeSolution(root, p, q).val);
        System.out.println("2) Recursive Solution Output => " + recursiveSolution(root, p, q).val);
        System.out.println("\n***************************************************\n");
        //endregion

        //region sample3
        System.out.println("********** EXAMPLE 3 INPUT TREE **********");
        root = getSampleTreeNode2(); //root=-10
        p = root.left.right; //p=-13
        q = root.left.left.left; //q=-25
        VisualizeTree.printTree(root, null, false);
        System.out.println("INPUTS: root node => " + root.val + " p=> " + p.val + " q=> " + q.val + " expected output => -15");

        System.out.println("1) Iterative Solution Output => " + iterativeSolution(root, p, q).val);
        System.out.println("2) Recursive Solution Output => " + recursiveSolution(root, p, q).val);
        System.out.println("\n***************************************************\n");
        //endregion
    }

    static TreeNode getSampleTreeNode2(){
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(-15);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(-22);
        root.left.right = new TreeNode(-13);
        root.left.left.left = new TreeNode(-25);

        return root;
    }

    static TreeNode getSampleTreeNode1(){
        TreeNode root = new TreeNode(13);
        root.left = new TreeNode(5);
        root.right = new TreeNode(16);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(10);
        root.right.left = new TreeNode(14);
        root.right.right = new TreeNode(28);

        return root;
    }

    static TreeNode iterativeSolution(TreeNode root, TreeNode p, TreeNode q) {
        int small = Math.min(p.val, q.val);
        int large = Math.max(p.val, q.val);
        while (root != null) {
            if (root.val > large) // p, q belong to the left subtree
                root = root.left;
            else if (root.val < small) // p, q belong to the right subtree
                root = root.right;
            else // Now, small <= root.val <= large -> This root is the LCA between p and q
                return root;
        }
        return null;
    }

    static TreeNode recursiveSolution(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        // both p and q are less than root
        // their ancestor must be in root.left
        if (p.val < root.val && q.val < root.val)
            return recursiveSolution(root.left, p, q);

        // both p and q are greater than root
        // their ancestor must be in root.right
        if (p.val > root.val && q.val > root.val)
            return recursiveSolution(root.right, p, q);

        return root;
    }
}

