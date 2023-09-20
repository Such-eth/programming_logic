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
    public List<TreeNode> list;
    public boolean isSubtree(TreeNode root, TreeNode sub) {
        list = new ArrayList<>();
        boolean ans=false;
        find(root,sub.val);
        for(TreeNode node:list){
            ans=ans||check(node,sub);
        }
        return ans;
    }
    public void find(TreeNode node,int val){
        if(node==null)
            return;
        find(node.left,val);
        if(node.val==val)
            list.add(node);
        find(node.right,val);
    }
    public boolean check(TreeNode node,TreeNode sub){
        if(node==null&&sub!=null || node!=null&&sub==null)
            return false;
        if(node==null && sub==null)
            return true;
        if(node.val!=sub.val)
            return false;
        return check(node.left,sub.left)&&check(node.right,sub.right);
    }
}