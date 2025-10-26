/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        List<Integer> A = new ArrayList<>();
        while (head != null) {
            A.add(head.data);
            head = head.next;
        }
        int i = 0, j = A.size() - 1;
        while (i < j) {
            if (!A.get(i).equals(A.get(j))) return false;
            i++; j--;
        }
        return true;
    }
}