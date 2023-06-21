package trees.binary_tree.binary_search_tree;

import trees.binary_tree.Node;

public class SearchInBST {
    boolean search(Node node, int key) {
        if(node == null) {
            return false;
        }

        if(node.data == key) {
            return true;
        }
        if(node.data > key) {
            return search(node.left, key);
        }
        if(node.data < key) {
            return search(node.right, key);
        }
        return false;
    }
    public static void main(String[] args) {
        SearchInBST searchInBST = new SearchInBST();
        int nodeValues[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        BuildBST buildBST = new BuildBST();
        Node root = buildBST.build(nodeValues);
        int searchKey = 7;
        boolean search = searchInBST.search(root, searchKey);
        System.out.println(search);
    }
}
