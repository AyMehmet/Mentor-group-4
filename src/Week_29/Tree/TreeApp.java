package Week_29.Tree;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree=new MyTree();
        int[] numbers=new int[] {10, 6,20, 4};
        for (int i = 0; i < numbers.length; i++) {
            tree.insert(numbers[i]);
        }
        



      VisualizeTree.printTree(tree.root,null,false);

//        tree.preOrderTraversal(tree.root);
//        System.out.println();
        System.out.println("In Order Traversal :");
        tree.inOrderTraversal(tree.root);
        System.out.println();
        tree.inOrderTraversalIter(tree.root);
        System.out.println();
//        System.out.println();
//        System.out.println("Post Order Traversal: ");
//        tree.postOrderTraversal(tree.root);
//        System.out.println();
//        System.out.println("Level Order Traversal: ");
//        tree.levelOrderTraversal();

        tree.printLeaves(tree.root);
        System.out.println();
        System.out.println("Number of leaves:  " +tree.countLeaves(tree.root));
        System.out.println("Sum of Leaf Nodes: " + tree.findSumOfLeaves(tree.root));
        System.out.println(tree.height(tree.root));
    }
}
