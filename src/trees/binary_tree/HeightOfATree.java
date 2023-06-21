package trees.binary_tree;

public class HeightOfATree {
    int findHeight(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        int height = Math.max(leftHeight, rightHeight) +1;
        return height;
    }

    public static void main(String[] args) {
        HeightOfATree heightOfATree = new HeightOfATree();
        CreateTree createTree = new CreateTree();
        Node root = createTree.createTreeSample1();
        int height = heightOfATree.findHeight(root);
        System.out.println("Height of a tree: " + height);
    }
}
