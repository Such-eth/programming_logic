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
    public int longestUnivaluePath(TreeNode root) {
        max=0;
        check(root,-1);
        return max;
    }
    public int check(TreeNode node,int val){
        if(node==null)
            return 0;
        int left = check(node.left,node.val);
        int right = check(node.right,node.val);
        max = Math.max(max,left+right);
        if(node.val==val)
            return 1+Math.max(left,right);
        return 0;
    }
}