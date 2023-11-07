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
    public int goodNodes(TreeNode root) {
        return count(root,-Integer.MAX_VALUE);
    }
    public int count(TreeNode node,int max){
        if(node==null)
            return 0;
        int ans=0;
        if(node.val>=max)
            ans++;
        ans+=count(node.left,Math.max(max,node.val));
        ans+=count(node.right,Math.max(max,node.val));
        return ans;
    }
}