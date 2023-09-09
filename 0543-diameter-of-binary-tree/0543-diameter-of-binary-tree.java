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
        max(root);
        return max;
    }
//     public int dia(TreeNode root){
//         if(root==null)
//             return 0;
//         int left=dia(root.left);
//         int right=dia(root.right);
//         max=Math.max(max,left+right);
//         return 1+Math.max(left,right);
//     }
    public int max(TreeNode node){
        if(node==null)
            return 0;
        int lefth = max(node.left);
        int righth=max(node.right);
        int depth=Math.max(lefth,righth)+1;
        max=Math.max(max,lefth+righth);
        return depth;
    }
}