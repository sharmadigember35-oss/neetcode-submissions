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
    public List<Integer> rightSideView(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int level =0;
        find_answer(root,list,level);
        return list;
    }
    public void find_answer(TreeNode root , List<Integer> list , int level){
        // now think more about the conditon 
        if(root == null){
            return;
        }
        if(level == list.size()){
            list.add(root.val);
        }
        find_answer(root.right,list,level+1);
        find_answer(root.left,list,level+1);
    }
}
