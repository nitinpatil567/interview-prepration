package trees.binary_tree.traversals.DFS;

import trees.binary_tree.CreateTree;
import trees.binary_tree.Node;

/*
Inorder traversal rule (Part of DFS - Linear Time complexity ie O(n))
    1. Left subtree
    2. root
    3. Right subtree
 */
public class InorderTraversal {
    Node root;

    void traversalTree(Node node) {
        if (node == null) {
            return;
        }

        traversalTree(node.left);
        System.out.print(node.data + " ");
        traversalTree(node.right);
    }

    public static void main(String[] args) {
        InorderTraversal inorderTraversal = new InorderTraversal();
        CreateTree createTree = new CreateTree();
        inorderTraversal.root = createTree.createTreeSample2();
        inorderTraversal.traversalTree(inorderTraversal.root);
    }
}
