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
    TreeNode lca;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lca = null;
        traverse(root,p,q);
        return lca;
    }
    public int traverse(TreeNode root, TreeNode p, TreeNode q){
        if(root==null)
            return 0;
        int n1 = traverse(root.left,p,q);
        int n2 = traverse(root.right,p,q);
        // System.out.println(root.val+" "+n1+" "+n2+" "+lca.val);
        if(n1==-1 || n2==-1)
            return -1;
        if(n1+n2==2){
            lca = root;
            return -1;
        }
        if((root==p || root==q) && (n1==1 || n2==1)){
            lca=root;
            return -1;
        }
        if(root==p || root==q)
            return 1;
        return n1+n2;
    }
}