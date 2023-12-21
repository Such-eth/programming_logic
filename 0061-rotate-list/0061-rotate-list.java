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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        int count=0;
        ListNode temp = head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        temp.next=head;
        count++;
        int rotate;
        if(k<count){
            rotate = count-k-1;
        }else{
            rotate = count-(k%count)-1;
        }
        temp=head;
        for(int i=0;i<rotate;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}