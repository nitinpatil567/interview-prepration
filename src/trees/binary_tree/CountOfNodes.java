package trees.binary_tree;

public class CountOfNodes {
    int totalNodes(Node node) {
        if (node == null) {
            return 0;
        }
        int leftCount = totalNodes(node.left);
        int rightCount = totalNodes(node.right);
        return leftCount + rightCount + 1;
    }

    public static void main(String[] args) {
        CountOfNodes countOfNodes = new CountOfNodes();
        CreateTree createTree = new CreateTree();
        int total = countOfNodes.totalNodes(createTree.createTreeSample1());
        System.out.println("Total " + total);
    }
}
