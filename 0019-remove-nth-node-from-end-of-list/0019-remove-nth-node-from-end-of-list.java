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
    int count;
    ListNode Node;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        count=0;
        Node=null;
        remove(head,n+1);
        if(Node!=null && Node.next!=null)
            Node.next=Node.next.next;
        if(Node==null)
            head=head.next;
        return head;
    }
    public void remove(ListNode head, int n){
        if(head==null){
            return;
        }
        remove(head.next,n);
        count++;
        if(n==count){
            Node = head;
            return;
        }        
    }
}