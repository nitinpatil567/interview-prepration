package trees.binary_tree;

public class LevelOfNode {
    Node root;

    int findLevel(Node node, int value, int level) {
        if (node == null) {
            return 0;
        }
        if(node.data == value) {
            return level;
        }

        int leftLevel = findLevel(node.left, value, level+1);
        if(leftLevel != 0) {
            return leftLevel;
        }

        int rightLevel = findLevel(node.right, value, level+1);
        if(rightLevel != 0) {
            return rightLevel;
        }

        return 0;
    }

    public static void main(String[] args) {
        LevelOfNode tree = new LevelOfNode();
        CreateTree nodeTree = new CreateTree();
        tree.root = nodeTree.createTreeSample1();
        int targetValue = 5;
        int level = tree.findLevel(tree.root, targetValue, 1);
        System.out.println(level);
    }
}
