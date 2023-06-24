package trees.binary_tree.binary_search_tree;

import trees.binary_tree.Node;

/*
Tree Structure - BST sample 1 from assets
 */
public class DeleteNode {
    Node deleteTreeNode(Node node, int targetNodeValue) {
        if(node == null) {
            return null;
        }
        if(node.data > targetNodeValue) {
            node.left = deleteTreeNode(node.left, targetNodeValue);
        } else if (node.data == targetNodeValue) {
            //Case 1 - Leaf node
            if(node.left == null && node.right == null) {
                return null;
            }
            //Case 2 - No left but right is available
            if(node.left == null) {
                return node.right;
            }
            //Case 3 - No right but left is available
            if(node.right == null) {
                return node.left;
            }
            //Case 4 - find leftmost inorder successor of node which is going to be deleted
            Node inorderSuccessor = inOrderSuccessor(node.right);
            node.data = inorderSuccessor.data;
            node.right = deleteTreeNode(node.right, inorderSuccessor.data);

        } else if(node.data < targetNodeValue) {
            node.right = deleteTreeNode(node.right, targetNodeValue);
        }
        return node;
    }

    Node inOrderSuccessor(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static void main(String[] args) {
        DeleteNode deleteNode = new DeleteNode();
        int nodeValues[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        BuildBST buildBST = new BuildBST();
        Node root = buildBST.build(nodeValues);
        System.out.println("Before delete");
        buildBST.inOrderTraversalToCheckIsBST(root);
        root = deleteNode.deleteTreeNode(root, 10);
        System.out.println("After delete");
        buildBST.inOrderTraversalToCheckIsBST(root);
    }
}
