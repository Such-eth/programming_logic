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
    String str;
    public String tree2str(TreeNode root) {
        str = "";
        traverse(root);
        return str;
    }
    public void traverse(TreeNode node){
        if(node==null)
            return;
        str+=String.valueOf(node.val);
        if(node.left==null && node.right==null)
            return;
        str+="(";
        traverse(node.left);
        str+=")";
        if(node.right!=null){
            str+="(";
            traverse(node.right);
            str+=")";
        }
    }
}