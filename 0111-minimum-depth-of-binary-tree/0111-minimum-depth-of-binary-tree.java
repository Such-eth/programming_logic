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
    public int depth;
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        depth = Integer.MAX_VALUE;
        traverse(root,0);
        return depth+1;
    }
    public void traverse(TreeNode node, int count){
        if(node==null)
            return;
        if(node.left==null && node.right==null)
            depth=Math.min(depth,count);
        traverse(node.left,count+1);
        traverse(node.right,count+1);
    }
}