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
class Solution {
    ListNode ptr;
    Boolean ans;
    public boolean isPalindrome(ListNode head) {
        ptr=head;
        ans=true;
        helper(head);
        return ans;
    }
    public void helper(ListNode head){
        if(head==null){
            return;
        }
        helper(head.next);
        if(head.val != ptr.val){
            ans=false;
            return;
        }
        ptr=ptr.next;
    }
}