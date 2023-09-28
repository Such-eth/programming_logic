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
    public long max;
    public long tot;
    public int maxProduct(TreeNode root) {
        max=0;
        tot=sum(root);
        sum(root);
        return (int)(max % (int)(1e9 + 7));
    }
    public long sum(TreeNode node){
        if(node==null)
            return 0;
        long sum=sum(node.left)+sum(node.right)+node.val;
        max = Math.max(max,(tot-sum)*sum);
        return sum;
    }
}