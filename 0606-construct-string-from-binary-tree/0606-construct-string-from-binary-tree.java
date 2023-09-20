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
    StringBuilder str;
    public String tree2str(TreeNode root) {
        str = new StringBuilder();
        traverse(root);
        return str.toString();
    }
    public void traverse(TreeNode node){
        if(node==null)
            return;
        str.append(String.valueOf(node.val));
        if(node.left==null && node.right==null)
            return;
        str.append("(");
        traverse(node.left);
        str.append(")");
        if(node.right!=null){
            str.append("(");
            traverse(node.right);
            str.append(")");
        }
    }
}