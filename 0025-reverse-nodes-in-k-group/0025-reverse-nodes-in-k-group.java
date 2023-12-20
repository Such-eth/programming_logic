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
    ListNode ans;
    int count;
    public ListNode reverseKGroup(ListNode head, int k) {
        count=0;
        ListNode temp1 = head;
        ListNode temp2 = head;
        ListNode node = new ListNode(-1);
        ListNode tempNode = node;
        while(temp2!=null){
            int i;
            for(i=0;i<k;i++){
                temp2=temp2.next;
                if(temp2==null)
                    break;
            }
            if(i<k-1)
                break;
            ListNode temp3 = reverseLinkedList(temp1,temp2);
            node.next=temp3;
            while(node.next!=null)
                node=node.next;
            temp1=temp2;
        }
        while(temp1!=null){
            node.next=temp1;
            temp1=temp1.next;
            node=node.next;
        }
        return tempNode.next;
    }
    
    public ListNode reverseLinkedList(ListNode head, ListNode node){
        ListNode prev=null;
        ListNode pres = head;
        ListNode next = head.next;
        while(pres != node){
          pres.next=prev;
            prev = pres;
            pres = next;
            if(next==node)
                break;
            next=next.next;
        }
        return prev;
    } 
    
}