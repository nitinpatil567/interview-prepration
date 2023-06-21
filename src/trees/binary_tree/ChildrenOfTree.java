package trees.binary_tree;

/*
    Tree reference taken from images/tree-sample-1.png
 */

public class ChildrenOfTree {
    Node root;

    Node searchNode(Node node, int value) {
        if (node == null || node.data == value) {
            return node;
        }

        Node leftResult = searchNode(node.left, value);
        if (leftResult != null) {
            return leftResult;
        }

        Node rightResult = searchNode(node.right, value);
        if (rightResult != null) {
            return rightResult;
        }

        return null;
    }

    public static void main(String[] args) {
        ChildrenOfTree tree = new ChildrenOfTree();
        CreateTree treeNode = new CreateTree();
        tree.root = treeNode.createTreeSample1();

        System.out.println("By Target Value");
        //By target value
        int targetValue = 2;
        Node node = tree.searchNode(tree.root, targetValue);
        tree.printChildren(node);
        System.out.println("By Target Node");
        // By target Node
        tree.printChildren(tree.root.left);
    }

    void printChildren(Node node) {
        if (node == null) {
            return;
        }
        System.out.println("Root Node Data: " + node.data);
        if (node.left != null) {
            System.out.println("Left Child Data: " + node.left.data);
        }

        if (node.right != null) {
            System.out.println("Right Child Data: " + node.right.data);
        }

        printChildren(node.left);
        printChildren(node.right);
    }
}
