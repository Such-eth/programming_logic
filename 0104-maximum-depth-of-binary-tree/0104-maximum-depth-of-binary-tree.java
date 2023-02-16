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
    public int maxDepth(TreeNode root) {
        if(root==null){return 0;}
        return helper(root,1);
    }
    public int helper(TreeNode node,int count){
        if(node==null){return count-2;}
        if(node.left==null && node.right==null){return count;}
        return Math.max(helper(node.left,count+1),helper(node.right,count+1));
    }
}