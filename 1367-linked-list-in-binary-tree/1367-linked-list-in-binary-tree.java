/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public List<TreeNode> list;
    public boolean isSubPath(ListNode head, TreeNode root) {
        int val=head.val;
        list = new ArrayList<>();
        findNodes(root,val);
        boolean ans = false;
        for(TreeNode node: list){
            ans=ans||check(head,node);
        }
        return ans;
    }
    public void findNodes(TreeNode node, int val){
        if(node==null)
            return;
        findNodes(node.left,val);
        if(node.val==val)
            list.add(node);
        findNodes(node.right,val);
    }
    public boolean check(ListNode head,TreeNode root){
        if(head==null && root==null){
            return true;
        }
        if(head!=null && root==null)
            return false;
        if(head==null && root!=null)
            return true;
        if(head.val!=root.val)
            return false;
        boolean left=check(head.next,root.left);
        boolean right=check(head.next,root.right);
        return left||right;
    }
}