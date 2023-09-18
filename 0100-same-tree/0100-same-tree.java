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
    // public boolean isSameTree(TreeNode p, TreeNode q) {
    //     if(p==null && q==null)
    //     return true;
    //     if(p==null&&q!=null || q==null&&p!=null)
    //     {
    //         return false;
    //     }
    //     if(p!=null && q!=null && p.val != q.val){
    //         return false;
    //     }
    //     else if(p.left==null && p.right==null && q.left==null && q.right==null){
    //         return true;
    //     }
    //     return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    // }
    
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null&&q!=null || p!=null&&q==null)
            return false;
        if((p==null && q==null)||(p.left==null && p.right==null && q.left==null && q.right==null && p.val==q.val))
            return true;
        if(p.val!=q.val)
            return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);    
    }
}