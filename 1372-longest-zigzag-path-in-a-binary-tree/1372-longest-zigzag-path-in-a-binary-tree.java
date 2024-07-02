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
    int max;
    public int longestZigZag(TreeNode root) {
        max = 0;
        findPath(root,0,true);
        findPath(root,0,false);
        return max;
    }
    public void findPath(TreeNode node, int path, boolean isLeft){
        if(node==null) return;
        max = Math.max(path,max);
        if(isLeft){
            findPath(node.right,path+1,!isLeft);
            findPath(node.left,1,isLeft);
        }else{
            findPath(node.left,path+1,!isLeft);
            findPath(node.right,1,isLeft);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}