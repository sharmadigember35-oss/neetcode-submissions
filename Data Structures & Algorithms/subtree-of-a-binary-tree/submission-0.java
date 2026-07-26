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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean ans = false;
        if(root == null){
            return false;
        }
        if(find_answer(root,subRoot)){
            return true;
        }
         return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
        }
       
         
    
    public boolean find_answer(TreeNode root , TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if(root==null || subRoot==null){
            return false;
        }
        if(root.val!=subRoot.val){
            return false;
        }
        return find_answer(root.left,subRoot.left)&&find_answer(root.right,subRoot.right);
    }
}
