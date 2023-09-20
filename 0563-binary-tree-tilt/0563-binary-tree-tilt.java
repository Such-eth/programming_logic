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
    public int ans;
    public int findTilt(TreeNode root) {
        traverse(root);
        return ans;
    }
    public int traverse(TreeNode node){
        if(node==null)
            return 0;
        if(node.left==null && node.right==null){
            int val=node.val;
            node.val=0;
            return val;
        }
        int left=traverse(node.left);
        int right=traverse(node.right);
        int diff=Math.abs(left-right);
        int val = node.val;
        node.val=diff;
        ans+=diff;
        return left+right+val;
    }
}