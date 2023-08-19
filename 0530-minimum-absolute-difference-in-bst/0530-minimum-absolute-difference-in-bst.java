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
    List<Integer> list;
    public int getMinimumDifference(TreeNode root) {
        list = new ArrayList<>();
        inorder(root);
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            int diff = list.get(i)-list.get(i-1);
            if(diff<ans)
                ans=diff;
        }
        return ans;
    }
    public void inorder(TreeNode node){
        if(node!=null){
            inorder(node.left);
            list.add(node.val);
            inorder(node.right);
        }
    }
}