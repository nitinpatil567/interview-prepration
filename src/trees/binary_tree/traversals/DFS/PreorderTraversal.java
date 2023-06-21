package trees.binary_tree.traversals.DFS;

/*
Use reference tree sample 2 from image folder
 */

import trees.binary_tree.CreateTree;
import trees.binary_tree.Node;

/*
Preorder traversal rule (Part of DFS - Linear Time complexity ie O(n))
    1. Print Root
    2. Print Left
    3. Print Right
 */
public class PreorderTraversal {
    Node root;

    void traversalTree(Node node) {
        if (node == null) {
//            System.out.println(-1);
            return;
        }
        System.out.println(node.data);
        traversalTree(node.left);
        traversalTree(node.right);
    }

    public static void main(String[] args) {
        PreorderTraversal preorderTraversal = new PreorderTraversal();
        CreateTree createTree = new CreateTree();
        preorderTraversal.root = createTree.createTreeSample2();
        preorderTraversal.traversalTree(preorderTraversal.root);
    }
}
