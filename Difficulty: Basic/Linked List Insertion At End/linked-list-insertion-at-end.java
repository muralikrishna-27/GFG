/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    Node insertAtEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) return temp;
        Node tail = head;
        while (tail.next != null) tail = tail.next;
        tail.next = temp;
        return head;
    }
}
