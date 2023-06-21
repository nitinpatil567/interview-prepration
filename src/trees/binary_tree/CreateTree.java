package trees.binary_tree;

/*
    Tree reference taken from images/tree-sample-1.png
 */
public class CreateTree {
    Node createTreeSample1() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(8);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.right.right = new Node(9);
        return root;
    }

    public Node createTreeSample2() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        return root;
    }

    public Node createSubTreeSampleFor1() {
        Node root = new Node(4);
        root.left = new Node(7);
        root.right = new Node(8);
        return root;
    }
}
