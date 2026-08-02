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
    public int goodNodes(TreeNode root) {
        
        int max = Integer.MIN_VALUE;
        int ans = find_answer(root,max);
        return ans;

    }
    public int find_answer(TreeNode root , int max){
        if(root==null){
            return 0;
        }
        int count =0;
        if(root.val>=max){
            count = 1;
        }
        
        max = Math.max(max,root.val);
         System.out.println(count+" "+root.val);
        count+=find_answer(root.right,max);
        System.out.println("this value after the root.right");
        System.out.println(count+" "+root.val);
         
        count+=find_answer(root.left,max);
        System.out.println("this value befor the root.left");
        System.out.println(count+" "+root.val);
        
        
         
        return count;
    }
}
