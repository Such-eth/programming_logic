/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node node = head;
        while(node!=null){
            Node temp = new Node(node.val);
            temp.next = node.next;
            node.next = temp;
            node = node.next.next;
        }
        node=head;
        while(node!=null && node.next!=null){
            if(node.random==null)
                node.next.random=null;
            else
                node.next.random=node.random.next;
            node=node.next.next;
        }
        node=head;
        Node temp = new Node(-1);
        Node temp1 = temp;
        while(node!=null && node.next!=null){
            temp.next = node.next;
            node.next = node.next.next;
            temp=temp.next;
            node=node.next;
        }
        return temp1.next;
    }
}