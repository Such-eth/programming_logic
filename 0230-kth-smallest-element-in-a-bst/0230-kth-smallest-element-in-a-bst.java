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
    static int ans,count;
    public int kthSmallest(TreeNode root, int k) {
        ans=0;
        count=0;
        helper(root,k); 
        return ans;
    }
    public void helper(TreeNode root, int k){
        if(root==null){return;}
        helper(root.left,k);
        count++;
        if(k==count){ans=root.val;}
        helper(root.right,k);        
    }
}