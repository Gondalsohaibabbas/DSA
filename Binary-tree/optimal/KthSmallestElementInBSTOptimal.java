import java.util.Stack;

public class KthSmallestElementInBSTOptimal {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();

        while (true) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            k--;

            if (k == 0)
                return root.val;

            root = root.right;
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.println(kthSmallest(root, 1));
    }
}

/*
Time Complexity: O(k)
Space Complexity: O(h)
*/
