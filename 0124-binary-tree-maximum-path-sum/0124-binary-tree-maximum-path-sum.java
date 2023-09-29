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
    public int max;
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        if(root.left==null && root.right==null)
            return root.val;
        findSum(root);
        return max;
    }
    public int findSum(TreeNode node){
        if(node==null)
            return 0;
        int left = Math.max(0,findSum(node.left));
        int right = Math.max(0,findSum(node.right));
        int pathSum = left+right+node.val;
        max=Math.max(max,pathSum);
        return Math.max(left,right)+node.val;
    }
}