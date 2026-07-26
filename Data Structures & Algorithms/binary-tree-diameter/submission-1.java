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
    int ans =0;
    public int diameterOfBinaryTree(TreeNode root) {
        // think about the condition 
         Inorder(root);
         return ans;
    }
    public int Inorder(TreeNode root){
        // let's think about the condition 
        if(root == null){
            return 0;
        }
        // now think about the condition 
        
        ans = Math.max(ans,(Inorder(root.left)+Inorder(root.right)));

        return 1+Math.max(Inorder(root.left), Inorder(root.right));

    }
}
