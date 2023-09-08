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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        if(root==null)
            return ans;
        q.offer(root);
        boolean right=true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr;
                if(right){
                    curr=q.poll();
                    if(curr.left!=null)
                        q.offer(curr.left);
                    if(curr.right!=null)
                        q.offer(curr.right);
                }
                else{
                    curr=q.pollLast();
                    if(curr.right!=null)
                        q.offerFirst(curr.right);
                    if(curr.left!=null)
                        q.offerFirst(curr.left);
                }                
                list.add(curr.val);
            }
            ans.add(list);
            if(right)
                    right=false;
            else
                right=true;
        }
        return ans;
    }
}