package week_32.lca.student_template;


/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree
 */
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

        //todo @students call their solution method here and print the output to the console. expected output for this sample is 13
        System.out.println("PRINT YOUR SOLUTION METHOD'S RETURN VALUE");
        System.out.println("\n***************************************************\n");
        //endregion

        //region sample2
        System.out.println("********** EXAMPLE 2 INPUT TREE **********");
        root = getSampleTreeNode1(); //root=13
        p = root.right; //p=16
        q = root.right.left; //q=14
        VisualizeTree.printTree(root, null, false);
        System.out.println("INPUTS: root node => " + root.val + " p=> " + p.val + " q=> " + q.val + " expected output => 16");

        //todo @students call their solution method here and print the output to the console. expected output for this sample is 16
        System.out.println("PRINT YOUR SOLUTION METHOD'S RETURN VALUE");
        System.out.println("\n***************************************************\n");
        //endregion

        //region sample3
        System.out.println("********** EXAMPLE 3 INPUT TREE **********");
        root = getSampleTreeNode2(); //root=-10
        p = root.left.right; //p=-13
        q = root.left.left.left; //q=-25
        VisualizeTree.printTree(root, null, false);
        System.out.println("INPUTS: root node => " + root.val + " p=> " + p.val + " q=> " + q.val + " expected output => -15");

        //todo @students call their solution method here and print the output to the console. expected output for this sample is -15
        System.out.println("PRINT YOUR SOLUTION METHOD'S RETURN VALUE");
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

}

