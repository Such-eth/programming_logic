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
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null,pres=slow,next=pres.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null)
                next=next.next;
        }
        ListNode l2=prev,l1=head;
        while(l1!=null && l2!=null){
            ListNode temp1=l1.next,temp2=l2.next;
            l1.next=l2;
            if(l2.next==null){break;}
            l2.next=temp1;
            l1=temp1;
            l2=temp2;
        }
               
    }
}