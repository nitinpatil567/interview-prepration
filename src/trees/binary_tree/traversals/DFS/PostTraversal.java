package trees.binary_tree.traversals.DFS;

import trees.binary_tree.CreateTree;
import trees.binary_tree.Node;

/*
Postorder traversal rule (Part of DFS - Linear Time complexity ie O(n))
    1. Left subtree
    2. Right subtree
    3. root
 */
public class PostTraversal {

    void traversalTree(Node node) {
        if (node == null) {
            return;
        }
        traversalTree(node.left);
        traversalTree(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        PostTraversal postTraversal = new PostTraversal();
        CreateTree createTree = new CreateTree();
        postTraversal.traversalTree(createTree.createTreeSample2());
    }
}
