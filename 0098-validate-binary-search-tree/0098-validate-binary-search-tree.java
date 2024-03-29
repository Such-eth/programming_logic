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
    public boolean isValidBST(TreeNode root) {
        if(root.left==null && root.right==null){return true;}
        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean helper(TreeNode node,long min,long max){
        if(node==null){return true;}
        if(node.val<=min || node.val>=max){return false;}
        return helper(node.left,min,node.val) && helper(node.right,node.val,max);
    }
    public boolean validate(TreeNode node,long left,long right){
        if(node==null)
            return true;
        if(node.val<=left || node.val>=right)
            return false;
        return validate(node.left,left,node.val)&&validate(node.right,node.val,right);
    }
}