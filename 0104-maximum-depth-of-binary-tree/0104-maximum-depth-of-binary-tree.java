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
        return maxi(root);
    }
    public int helper(TreeNode node){
        if(node==null)
            return 0;
        return 1+Math.max(helper(node.left),helper(node.right));
    }
    public int maxi(TreeNode node){
        if(node==null)
            return 0;
        int left = maxi(node.left);
        int right = maxi(node.right);
        return Math.max(left,right)+1;
    }
}