/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     if(root==null){return null;}
    //     if(p.val<root.val && q.val<root.val){
    //         return  lowestCommonAncestor(root.left,p,q);
    //     }
    //     if(p.val>root.val && q.val>root.val){
    //         return  lowestCommonAncestor(root.right,p,q);
    //     }
    //     return root;
    // }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        return lca(root,p,q);
    }
    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
        if(root==null)
            return null;
        if(root==p || root==q)
            return root;
        if(root.val>p.val && root.val>q.val){
            return lca(root.left,p,q);
        }
        if(root.val<p.val && root.val<q.val)
            return lca(root.right,p,q);
        return root;
    }
}