import java.util.*;

public class ValidateBinarySearchTreeBrute {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static List<Integer> list = new ArrayList<>();

    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public static boolean isValidBST(TreeNode root) {

        list.clear();
        inorder(root);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println(isValidBST(root));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
