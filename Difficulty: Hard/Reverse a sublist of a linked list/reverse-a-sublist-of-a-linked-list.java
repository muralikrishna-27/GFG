// User function Template for Java

/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution {
    public static Node reverseBetween(int a, int b, Node head) {
        if (head == null || a == b) return head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        for (int i = 1; i < a; i++) prev = prev.next;
        Node curr = prev.next;
        for (int i = 0; i < b - a; i++) {
            Node next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }
}
