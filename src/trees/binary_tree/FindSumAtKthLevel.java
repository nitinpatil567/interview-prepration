package trees.binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class FindSumAtKthLevel {
    int findSumAtLevel(Node node, int k) {
        if (node == null) {
            return 0;
        }
        Queue<Node> nodeQueue = new LinkedList<>();
        int index = 1;
        nodeQueue.add(node);
        nodeQueue.add(null);
        int sum = 0;
        while (!nodeQueue.isEmpty()) {
            Node currentNode = nodeQueue.remove();
            if(currentNode == null) {
                index++;
                if(nodeQueue.isEmpty()) {
                    break;
                } else {
                    nodeQueue.add(null);
                }
            } else {
                if(index == k) {
                    sum = sum + currentNode.data;
                }
                if (currentNode.left != null) {
                    nodeQueue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    nodeQueue.add(currentNode.right);
                }
            }
            if (index == k) {

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        FindSumAtKthLevel findSumAtKthLevel = new FindSumAtKthLevel();
        CreateTree createTree = new CreateTree();
        Node root = createTree.createTreeSample1();
        int level = 2;
        int sum = findSumAtKthLevel.findSumAtLevel(root, level);
        System.out.println("Sum: " + sum);
    }
}
