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
    public int sumNumbers(TreeNode root) {
        sum=0;
        traverse(root,0);
        return sum;
    }
    public void traverse(TreeNode node,int val){
        if(node==null)
            return;
        if(node.left==null && node.right==null)
            sum+=val*10+node.val;
        traverse(node.left,val*10+node.val);
        traverse(node.right,val*10+node.val);
    }
}