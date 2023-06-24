package trees.binary_tree.binary_search_tree;

import trees.binary_tree.Node;

import java.util.ArrayList;

public class PrintRootToLeaf {
    void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i));
            if(i < path.size()-1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    void print(Node node, ArrayList<Integer> path) {
        if (node == null) {
            return;
        }

        path.add(node.data);
        if (node.left == null && node.right == null) {
            printPath(path);
        } else {
            print(node.left, path);
            print(node.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int nodeValues[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        BuildBST buildBST = new BuildBST();
        Node root = buildBST.build(nodeValues);
        PrintRootToLeaf printRootToLeaf = new PrintRootToLeaf();
        printRootToLeaf.print(root, new ArrayList<>());
    }
}
