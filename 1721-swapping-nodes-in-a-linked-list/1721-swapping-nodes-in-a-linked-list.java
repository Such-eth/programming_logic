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
    int i=0;
    ListNode l1=null;
    public ListNode swapNodes(ListNode head, int k) {
        i=0;
        l1=null;
        search(head,k);
        System.out.println(l1.val);
        ListNode temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        int dup=temp.val;
        temp.val=l1.val;
        l1.val=dup;
        return head;
    }
    public void search(ListNode node,int k){
        if(node==null){
            return ;
        }
        search(node.next,k);
        i++;
        if(i==k){
            l1=node;
            return;
        }
    }
}