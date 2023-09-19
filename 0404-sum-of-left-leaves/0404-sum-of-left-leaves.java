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
    public int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum=0;
        findSum(root);
        return sum;
    }
    public void findSum(TreeNode node){
        if(node==null)
            return;
        if(node.left!=null && node.left.left==null && node.left.right==null){
            sum+=node.left.val;
        }
        findSum(node.left);
        findSum(node.right);
    }
}