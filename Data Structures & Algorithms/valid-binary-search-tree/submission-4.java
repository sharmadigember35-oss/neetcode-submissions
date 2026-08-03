/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
      return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean validate(TreeNode root, long min, long max) {

        // Base Case
        if (root == null) {
            return true;
        }

        // Current node should lie between min and max
        if (root.val <= min || root.val >= max) {
            return false;
        }

        // Check left and right subtrees
        return validate(root.left, min, root.val) &&
               validate(root.right, root.val, max);
}
}
