package trees.binary_tree.binary_search_tree;

import trees.binary_tree.Node;

public class BuildBST {
    Node build(int nodeValues[]) {
        Node root = null;
        for(int i=0; i<nodeValues.length;i++) {
            root = create(root, nodeValues[i]);
        }
        return root;
    }

    void inOrderTraversalToCheckIsBST(Node root) {
        if(root == null) {
            return;
        }
        inOrderTraversalToCheckIsBST(root.left);
        System.out.print(root.data+" ");
        inOrderTraversalToCheckIsBST(root.right);
    }

    Node create(Node root, int value) {
        if(root == null) {
            return new Node(value);
        }
        if(root.data > value) {
            root.left = create(root.left, value);
        } else {
            root.right = create(root.right, value);
        }
        return root;
    }

    public static void main(String[] args) {
        int nodeValues[] = {5, 1, 3, 4, 2, 7};
        BuildBST buildBST = new BuildBST();
        Node node = buildBST.build(nodeValues);
        buildBST.inOrderTraversalToCheckIsBST(node);
    }
}
