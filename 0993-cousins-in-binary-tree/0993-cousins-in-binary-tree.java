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
    public boolean isCousins(TreeNode root, int x, int y) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean one=true,two=true;
        while(queue.size()!=0){
            int size = queue.size();
            List<Integer> current = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                if(curr.val==x)
                    one=false;
                if(curr.val==y)
                    two = false;
                if(curr.left!=null)
                    queue.offer(curr.left);
                if(curr.right!=null)
                    queue.offer(curr.right);
                if(!(curr.left==null || curr.right==null))
                    if(curr.left.val==x && curr.right.val==y || curr.left.val==y && curr.right.val==x)
                        return false;
                    current.add(curr.val);
            }
            if(one^two)
                return false;
            ans.add(current);
        }
        return true;
    }
}