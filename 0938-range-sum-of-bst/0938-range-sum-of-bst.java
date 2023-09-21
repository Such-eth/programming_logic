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
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        findSum(root,low,high);
        return sum;
    }
    public void findSum(TreeNode node, int low, int high){
        if(node==null )
            return;
        if(!(node.val<low ||node.val>high))
            sum+=node.val;
        if(!(node.val<=low))
            findSum(node.left,low,high);
        if(!(node.val>=high))
            findSum(node.right,low,high);
    }
}