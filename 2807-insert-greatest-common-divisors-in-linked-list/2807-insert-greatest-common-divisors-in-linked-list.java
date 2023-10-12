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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
            ListNode prevNode = null;
        ListNode currNode = head;

        while(currNode != null) {
            if(prevNode != null && currNode != null) {
                int gcd = greatestCommonDivisor(prevNode.val, currNode.val);
                ListNode newNode = new ListNode(gcd, currNode);
                prevNode.next = newNode;
            }

            prevNode = currNode;
            currNode = currNode.next;
        }   

        return head;
    }

    private int greatestCommonDivisor(int val1, int val2) {

        if(val2 == 0) {
            return val1;
        }
        return greatestCommonDivisor(val2, val1%val2);
    }
}