package trees.binary_tree;

public class CountOfLeaves {
    Node root;

    int countLeaves(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }

        int leftCount = countLeaves(node.left);
        int rightCount = countLeaves(node.right);
        return leftCount + rightCount;
    }

    public static void main(String[] args) {
        CountOfLeaves tree = new CountOfLeaves();
        CreateTree nodeTree = new CreateTree();
        tree.root = nodeTree.createTreeSample1();
        int count = tree.countLeaves(tree.root);

        System.out.println("Total Leaves are: " + count);
    }
}
