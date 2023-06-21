package trees.binary_tree;

public class ParentOfANode {
    Node root;

    Node findParent(Node node, int value) {
        if (node == null || node.data == value) {
            return null;
        }

        if ((node.left != null && node.left.data == value) || (node.right != null && node.right.data == value)) {
            return node;
        }

        Node leftNode = findParent(node.left, value);
        if (leftNode != null) {
            return leftNode;
        }

        Node rightNode = findParent(node.right, value);
        if (rightNode != null) {
            return rightNode;
        }
        return null;
    }

    public static void main(String[] args) {
        ParentOfANode tree = new ParentOfANode();
        CreateTree nodeTree = new CreateTree();
        tree.root = nodeTree.createTreeSample1();
        int targetValue = 1;
        Node node = tree.findParent(tree.root, targetValue);
        if(node != null)
            System.out.println(node.data);
        else
            System.out.println("No data");
    }
}
