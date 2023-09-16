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
    public int count;
    public int kthSmallest(TreeNode root, int k) {
        count=k;
        TreeNode ans = find(root); 
        return ans.val;
    }
    // public void helper(TreeNode root, int k){
    //     if(root==null){return;}
    //     helper(root.left,k);
    //     count++;
    //     if(k==count){ans=root.val;}
    //     helper(root.right,k);        
    // }
    public TreeNode find(TreeNode node){
        if(node==null)
            return null;
        TreeNode left = find(node.left);
        if(left!=null)
            return left;
        if(count==1)
            return node;
        count=count-1;
        return find(node.right);
    }
}