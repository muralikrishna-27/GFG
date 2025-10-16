/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node reverseKGroup(Node head, int k) {
        if (head == null || k == 1) return head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy, curr = head, nex;
        int count = 0;
        while (curr != null) { count++; curr = curr.next; }
        while (count >= k) {
            curr = prev.next;
            nex = curr.next;
            for (int i = 1; i < k; i++) {
                curr.next = nex.next;
                nex.next = prev.next;
                prev.next = nex;
                nex = curr.next;
            }
            prev = curr;
            count -= k;
        }
        if (count > 0) {
            curr = prev.next;
            nex = curr.next;
            for (int i = 1; i < count; i++) {
                curr.next = nex.next;
                nex.next = prev.next;
                prev.next = nex;
                nex = curr.next;
            }
        }
        return dummy.next;
    }
}