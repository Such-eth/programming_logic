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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=new ListNode(0);
        ListNode temp=head;
        while(!isEmpty(lists)){
            int min=Integer.MAX_VALUE;
            int ind = -1;
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null && lists[i].val<min){
                    min=lists[i].val;
                    ind=i;
                }
            }
            lists[ind] = lists[ind].next;
            ListNode n = new ListNode(min);
            head.next=n;
            head=head.next;
        }
        return temp.next;
    }
    public boolean isEmpty(ListNode[] lists){
        for(ListNode list:lists){
            if(list!=null)
                return false;
        }
        return true;
    }
}