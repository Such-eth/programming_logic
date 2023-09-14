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
    public void flatten(TreeNode root) {
        TreeNode temp=root;
        while(temp!=null){
            TreeNode curr = temp.right;
            TreeNode left = temp.left;
            while(left!=null && left.right!=null){
                left=left.right;
            }
            if(left!=null){
                left.right = curr;
                temp.right = temp.left;
                temp.left=null;
            }
            temp=temp.right;
        }
    }
}