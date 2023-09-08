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
    public boolean cousin=true;
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
                current.add(curr.val);
            }
            if(one^two)
                return false;
            ans.add(current);
        }
        check(root,x,y);
        return cousin;
    }
    public void check(TreeNode root, int x, int y){
        if(root!=null){
            if(!(root.left==null || root.right==null))
                if(root.left.val==x && root.right.val==y || root.left.val==y && root.right.val==x)
                    cousin = false;
            check(root.left,x,y);
            check(root.right,x,y);
        }
    }
}