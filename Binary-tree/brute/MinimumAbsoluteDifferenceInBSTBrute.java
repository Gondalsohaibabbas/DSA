import java.util.*;

public class MinimumAbsoluteDifferenceInBSTBrute {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static List<Integer> list = new ArrayList<>();

    static void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public static int getMinimumDifference(TreeNode root) {

        list.clear();
        inorder(root);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                min = Math.min(min,
                        Math.abs(list.get(i) - list.get(j)));
            }
        }

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
Time Complexity: O(n²)
Space Complexity: O(n)
*/
