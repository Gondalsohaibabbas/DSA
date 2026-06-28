public class DiameterOfBinaryTreeBrute {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int height(TreeNode root) {

        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int diameter(TreeNode root) {

        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        return Math.max(leftHeight + rightHeight,
                Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(diameter(root));
    }
}

/*
Time Complexity: O(n²)
Space Complexity: O(h)
*/
