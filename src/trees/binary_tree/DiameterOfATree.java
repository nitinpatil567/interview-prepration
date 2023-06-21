package trees.binary_tree;

class TreeInfo {
    int height, diameter;

    TreeInfo(int height, int diameter) {
        this.height = height;
        this.diameter = diameter;
    }
}

public class DiameterOfATree {
    /*
    Following method have time complexity of O(n^2)
     */
    int findDiameter(Node node) {
        if (node == null) {
            return 0;
        }

        int leftDiameter = findDiameter(node.left);
        int rightDiameter = findDiameter(node.right);
        HeightOfATree heightOfATree = new HeightOfATree();
        int heightOfNode = heightOfATree.findHeight(node.left) + heightOfATree.findHeight(node.right) + 1;

        return Math.max(heightOfNode, Math.max(leftDiameter, rightDiameter));
    }

    TreeInfo findDiameterApproach2(Node node) {
        if (node == null) {
            return new TreeInfo(0,0);
        }

        TreeInfo leftTreeInfo = findDiameterApproach2(node.left);
        TreeInfo rightTreeInfo = findDiameterApproach2(node.right);
        int height = Math.max(leftTreeInfo.height, rightTreeInfo.height) + 1;
        int diameterOfNode = leftTreeInfo.height + rightTreeInfo.height + 1;
        int diameter = Math.max(diameterOfNode, Math.max(leftTreeInfo.diameter, rightTreeInfo.diameter));
        return new TreeInfo(height, diameter);
    }

    public static void main(String[] args) {
        DiameterOfATree diameterOfATree = new DiameterOfATree();
        CreateTree createTree = new CreateTree();
        Node node = createTree.createTreeSample1();
        int diameter = diameterOfATree.findDiameter(node);
        System.out.println("Diameter for Approach 1: " + diameter);
        TreeInfo treeInfo = diameterOfATree.findDiameterApproach2(node);
        System.out.println("Diameter for approach 2: " + treeInfo.diameter);
    }
}
