/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {           
                int len = 1;
                Node temp = slow.next;
                while(temp != slow) {     
                    temp = temp.next;
                    len++;
                }
                return len;
            }
        }
        return 0;  
        
    }
}