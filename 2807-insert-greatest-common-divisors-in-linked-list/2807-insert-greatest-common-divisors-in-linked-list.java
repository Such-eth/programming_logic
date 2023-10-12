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
        ListNode node = head;
        while(node!=null && node.next!=null){
            int num = findGdc(node.val,node.next.val);
            ListNode newNode = new ListNode(num);
            ListNode nextNode = node.next;
            node.next = newNode;
            newNode.next = nextNode;
            node=node.next.next;
        }
        return head;
        
    }
    public int findGdc(int num1,int num2){
        int ans=1;
        for(int i=Math.min(num1,num2);i>=1;i--){
            if(num1%i==0 && num2%i==0)
                return i;
        }
        return ans;
    }
}