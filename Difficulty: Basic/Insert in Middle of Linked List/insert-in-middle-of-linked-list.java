/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        if(head==null) return new Node(x);
        Node p = head,q=head;
        while(q.next!=null && q.next.next!=null){
            q = q.next.next;
            p = p.next;
        }
        Node r = new Node(x);
        r.next = p.next;
        p.next=r;
        
        return head;
    }
}