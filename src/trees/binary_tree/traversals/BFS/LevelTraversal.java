package trees.binary_tree.traversals.BFS;

import trees.binary_tree.CreateTree;
import trees.binary_tree.Node;

import java.util.LinkedList;
import java.util.Queue;

/*
Part of BFS (Linear Time complexity ie O(n))
Visit each level, print those nodes and then visit the node of left and right again print those adjuscent node
After printing each level add new line on level
We use Queue (FIFO) for visiting, storing and printing each level with new line. For new line we will use null value which we will save in queue

 */
public class LevelTraversal {
    void traversalTree(Node node) {
        if (node == null) {
            return;
        }
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(node);
        nodeQueue.add(null);
        while (!nodeQueue.isEmpty()) {
            Node currentNode = nodeQueue.remove();
            if (currentNode == null) {
                System.out.println();
                if (nodeQueue.isEmpty()) {
                    break;
                } else {
                     /*
                     This is for level more than 1 where adjucsent nodes ie left and right added and needs new line so added null
                      */
                    nodeQueue.add(null);
                }
            } else {
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null) {
                    nodeQueue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    nodeQueue.add(currentNode.right);
                }
            }
        }

    }

    public static void main(String[] args) {
        LevelTraversal levelTraversal = new LevelTraversal();
        CreateTree createTree = new CreateTree();
        levelTraversal.traversalTree(createTree.createTreeSample2());
    }
}
