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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);
        ListNode tempNode = node;
        int carry=0;
        while(l1 != null && l2 != null){
            int val = l1.val+l2.val+carry;
            if(val>9){
                val = val%10;
                node.next = new ListNode(val);
                carry=1;
            }else{
                node.next = new ListNode(val);
                carry=0;
            }
            node=node.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int val = l1.val+carry;
            if(val>9){
                val = val%10;
                node.next = new ListNode(val);
                carry=1;
            }else{
                node.next = new ListNode(val);
                carry=0;
            }
            l1=l1.next;
            node=node.next;
        }
        while(l2!=null){
            int val = l2.val+carry;
            if(val>9){
                val = val%10;
                node.next = new ListNode(val);
                carry=1;
            }else{
                node.next = new ListNode(val);
                carry=0;
            }
            l2=l2.next;
            node=node.next;
        }
        if(carry==1)
            node.next = new ListNode(1);
        return tempNode.next;
    }
}