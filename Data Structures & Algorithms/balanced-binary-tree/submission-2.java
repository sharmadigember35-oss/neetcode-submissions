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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        
        
        int left_height = find_answer(root.left);
        int right_height = find_answer(root.right);
        if(Math.abs(left_height-right_height)>1){
            return false;
        }
        return isBalanced(root.left)&& isBalanced(root.right);
    }
    public int find_answer(TreeNode root){
        if(root==null){
            return 0;
        }
        // now think more about the condition 
        int height = 1+Math.max(find_answer(root.left),find_answer(root.right));
        return height;
    }
}
