package trees.binary_tree;

public class CreateTreePreorder {
    int index = -1;

    Node buildTree(int nodes[]) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public static void main(String[] args) {
        CreateTreePreorder tree = new CreateTreePreorder();
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = tree.buildTree(nodes);
        ChildrenOfTree childrenOfTree = new ChildrenOfTree();
        childrenOfTree.printChildren(root);
    }
}
