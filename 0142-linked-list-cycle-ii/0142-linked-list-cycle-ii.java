/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        if(head==null || head.next==null)
            return null;
        do{
            slow=slow.next;
            fast=fast.next.next;
        }while(slow!=fast && fast!=null && fast.next!=null);
        if(fast==null || fast.next==null)
            return null;
        slow=head;
        while(slow!=fast && fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
}