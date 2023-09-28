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
    public ListNode Head;
    public boolean ans;
    public boolean isSubPath(ListNode head, TreeNode root) {
        int val=head.val;
        Head=head;
        ans=false;
        findNodes(root,val);
        return ans;
    }
    public void findNodes(TreeNode node, int val){
        if(node==null)
            return;
        if(ans==true)
            return;
        if(node.val==val){
            ans=ans||check(Head,node);
            if(ans)
                System.out.println(node.val);
        }
        findNodes(node.left,val);
        
        findNodes(node.right,val);
    }
    public boolean check(ListNode head,TreeNode root){
        if(head==null)
            return true;
        if(root==null)
            return false;
        if(head.val==root.val)
            return check(head.next,root.left)||check(head.next,root.right);
        return false;
    }
}