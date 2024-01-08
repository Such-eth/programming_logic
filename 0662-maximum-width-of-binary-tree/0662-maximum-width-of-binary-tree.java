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
    public int widthOfBinaryTree(TreeNode root) {
        int max = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            int left=0,right=0;
            for(int i=0;i<size;i++){
                Pair node = q.poll();
                if(i==0)
                    left=node.ind;
                if(i==size-1)
                    right=node.ind;
                if(node.val.left!=null)
                    q.offer(new Pair(node.val.left,2*node.ind+1));
                if(node.val.right!=null)
                    q.offer(new Pair(node.val.right,2*node.ind+2));
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
    class Pair{
        TreeNode val;
        int ind;
        public Pair(TreeNode val,int ind){
            this.val=val;
            this.ind=ind;
        }
    }
}