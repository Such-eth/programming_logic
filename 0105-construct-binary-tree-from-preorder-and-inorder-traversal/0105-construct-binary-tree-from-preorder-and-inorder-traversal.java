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
    public TreeNode buildTree(int[] pre, int[] in) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<in.length;i++){
            map.put(in[i],i);
        }
        int[] ind = {0};
        return build(pre,in,map,0,in.length-1,ind);
    }
    public TreeNode build(int[] pre, int[] in, HashMap<Integer,Integer> map,int start,int end,int[] ind){
        if(start>end)
            return null;
        TreeNode node = new TreeNode(pre[ind[0]]);
        ind[0]++;
        if(start==end)
            return node;
        int index = map.get(node.val);
        node.left = build(pre,in,map,start,index-1,ind);
        node.right = build(pre,in,map,index+1,end,ind);
        return node;
    }
}