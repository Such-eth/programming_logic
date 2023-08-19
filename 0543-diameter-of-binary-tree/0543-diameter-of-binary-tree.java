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
    public int diameterOfBinaryTree(TreeNode root) {
        // int[] max=new int[1];
        max=0;
        dia(root);
        return max;
    }
    public int dia(TreeNode root){
        if(root==null)
            return 0;
        int left=dia(root.left);
        int right=dia(root.right);
        max=Math.max(max,left+right);
        return 1+Math.max(left,right);
    }
}