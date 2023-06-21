package trees.binary_tree;

public class CheckSubTree {
    boolean isIdentical(Node root, Node subTree) {
        if(root == null && subTree == null) {
            return true;
        }
        if(root == null || subTree == null) {
            return false;
        }

        if(root.data == subTree.data) {
            return isIdentical(root.left, subTree.left) && isIdentical(root.right, subTree.right);
        }
        return false;
    }
    boolean isSubtree(Node root, Node subTree) {
        if(subTree == null) {
            return true;
        }

        if(root == null) {
            return false;
        }
        if(root.data == subTree.data) {
            if(isIdentical(root, subTree)) {
                return true;
            }
        }

        return isSubtree(root.left, subTree) || isSubtree(root.right, subTree);
    }
    public static void main(String[] args) {
        CheckSubTree checkSubTree = new CheckSubTree();
        CreateTree createTree = new CreateTree();
        Node root = createTree.createTreeSample1();
        Node subTree = createTree.createSubTreeSampleFor1();
        boolean flag = checkSubTree.isSubtree(root, subTree);
        System.out.println(flag);
    }
}
