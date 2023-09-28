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
    public List<Integer> li;
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> list = new ArrayList<>();
        li = new ArrayList<>();
        traverse(root);
        for(int q:queries){
            List<Integer> lis = new ArrayList<>(2);
            lis.add(floor(li,q));
            lis.add(roof(li,q));
            list.add(lis);
        }
        return list;
    }
    public void traverse(TreeNode root){
        if(root==null)
            return;
        traverse(root.left);
        li.add(root.val);
        traverse(root.right);
    }
    public int floor(List<Integer> list,int val){
        int start = 0;
        int end = list.size()-1;
        int ans=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(list.get(mid)==val){
                return val;
            }
            if(list.get(mid)>val){
                end=mid-1;
            }else{
                ans=list.get(mid);
                start=mid+1;
            }
        }
        return ans;
    }
    public int roof(List<Integer> list,int val){
        int start = 0;
        int end = list.size()-1;
        int ans=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(list.get(mid)==val){
                return val;
            }
            if(list.get(mid)<val){
                start=mid+1;
            }
            else{
                ans=list.get(mid);
                end=mid-1;
            }
        }
        return ans;
    }
    
}