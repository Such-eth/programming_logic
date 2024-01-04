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
    TreeNode first,second,prev;
    public void recoverTree(TreeNode root) {
        first=second=null;
        searchInTree(root);
        int val = first.val;
        first.val=second.val;
        second.val = val;
    }
    public void searchInTree(TreeNode root){
        if(root==null)
            return;
        searchInTree(root.left);
        if(prev!=null && root.val<prev.val){
            if(first==null){
                first=prev;
                second=root;
            }
            else second=root;
        }
        prev=root;
        searchInTree(root.right);
    }
}