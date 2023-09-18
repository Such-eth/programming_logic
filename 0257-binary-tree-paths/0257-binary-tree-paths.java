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
    List<String> list;
    public List<String> binaryTreePaths(TreeNode root) {
        list = new ArrayList<>();
        findPaths(root,"");
        return list;
    }
    public void findPaths(TreeNode node,String path){
        if(node==null)
            return;
        if(node.left==null && node.right==null){
            path+=String.valueOf(node.val);
            list.add(path);
            return;
        }
        path+=String.valueOf(node.val)+"->";
        findPaths(node.left,path);
        findPaths(node.right,path);
    }
}