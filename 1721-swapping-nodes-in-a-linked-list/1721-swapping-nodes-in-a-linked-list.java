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
    int i=0,j=0;
    ListNode l1=null,l2=null;
    public ListNode swapNodes(ListNode head, int k) {
        i=0;
        j=0;
        l1=null;
        l2=null;
        search(head,k);
        int dup=l2.val;
        l2.val=l1.val;
        l1.val=dup;
        return head;
    }
    public void search(ListNode node,int k){
        if(node==null){
            return ;
        }
        j++;
        if(j==k){
            l2=node;
        }
        search(node.next,k);
        i++;
        if(i==k){
            l1=node;
        }
    }
}