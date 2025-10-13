/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node h1, Node h2) {
        Node dummy = new Node(0), p = dummy;
        while(h1 != null && h2 != null){
            if(h1.data < h2.data){ p.next = h1; h1 = h1.next; }
            else { p.next = h2; h2 = h2.next; }
            p = p.next;
        }
        p.next = (h1 != null) ? h1 : h2;
        return dummy.next;
    }
}
