package trees.binary_tree.binary_search_tree;

import trees.binary_tree.Node;

public class PrintInRange {
    void print(Node node, int x, int y) {
        if(node == null) {
            return;
        }
        if(node.data >= x && node.data <= y) {
            print(node.left, x, y);
            System.out.print(node.data+" ");
            print(node.right, x, y);
        } else if(node.data >= y) {
            print(node.left, x, y);
        } else {
            print(node.right, x, y);
        }
    }
    public static void main(String[] args) {
        int nodeValues[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        BuildBST buildBST = new BuildBST();
        Node root = buildBST.build(nodeValues);
        PrintInRange printInRange = new PrintInRange();
        int x = 6, y = 10;
        printInRange.print(root, x, y);
    }
}
