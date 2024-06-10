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
    public TreeNode sortedArrayToBST(int[] nums) {
        return find(nums,0,nums.length-1);
    }
    public TreeNode find(int[] arr,int i,int j){
        if(i<0 || j<0 || i>=arr.length || j>=arr.length || i>j)
            return null;
        int mid = (i+j)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = find(arr,i,mid-1);
        node.right = find(arr,mid+1,j);
        return node;
    }
}