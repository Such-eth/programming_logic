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
    public TreeNode prev;
    public int getMinimumDifference(TreeNode root) {
        prev=null;
        ans = Integer.MAX_VALUE;
        inorder(root);
        return ans;
    }
    public void inorder(TreeNode node){
        if(node!=null){
            inorder(node.left);
            if(prev!=null){
                int diff = Math.abs(node.val-prev.val);
                ans=Math.min(diff,ans);
            }
            prev=node;
            inorder(node.right);
        }
    }
}