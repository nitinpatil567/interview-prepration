package trees.binary_tree;

public class SumOfNodes {
    int totalSumOfNodes(Node node) {
        if (node == null) {
            return 0;
        }
        int leftSum = totalSumOfNodes(node.left);
        int rightSum = totalSumOfNodes(node.right);
        return leftSum + rightSum + node.data;
    }

    public static void main(String[] args) {
        SumOfNodes sumOfNodes = new SumOfNodes();
        CreateTree createTree = new CreateTree();
        int total = sumOfNodes.totalSumOfNodes(createTree.createTreeSample1());
        System.out.println("Total " + total);
    }
}
