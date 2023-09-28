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
    public int pathSum(TreeNode root, int targetSum) {
        ans=0;
        check(root,targetSum);
        return ans;
    }
    public void check(TreeNode root, int val){
        if(root==null)
            return;
        find(root,val);
        check(root.left,val);
        check(root.right,val);
    }
    public void find(TreeNode root, long val){
        if(root==null)
            return;
        if(root.val==val){
            System.out.println(root.val+" "+val);
            ans++;
        }   
        find(root.left,val-root.val);
        find(root.right,val-root.val);
    }
}