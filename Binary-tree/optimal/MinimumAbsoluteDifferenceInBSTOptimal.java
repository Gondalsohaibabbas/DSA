public class MinimumAbsoluteDifferenceInBSTOptimal {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static Integer prev = null;
    static int min = Integer.MAX_VALUE;

    public static void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);

        if (prev != null)
            min = Math.min(min, root.val - prev);

        prev = root.val;

        inorder(root.right);
    }

    public static int getMinimumDifference(TreeNode root) {

        prev = null;
        min = Integer.MAX_VALUE;

        inorder(root);

        return min;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(getMinimumDifference(root));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(h)
*/
