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
    public int maxLevel,sum;
    public int deepestLeavesSum(TreeNode root) {
        maxLevel=0;
        sum=0;
        find(root,0);
        return sum;
    }
    public void find(TreeNode node, int level){
        if(node==null)
            return;
        if(level>maxLevel){
            maxLevel=level;
            sum=0;
        }
        if(level==maxLevel)
            sum+=node.val;
        find(node.left,level+1);
        find(node.right,level+1);
    }
}