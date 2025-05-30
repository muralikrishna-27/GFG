import java.util.Queue;

class Solution {
    // Function to push an element in queue.
    void enqueue(Queue<Integer> q, int x) {
        q.add(x);
    }

    // Function to remove front element from queue.
    void dequeue(Queue<Integer> q) {
        if (!q.isEmpty()) {
            q.poll();
        }
    }

    // Function to find the front element of queue.
    int front(Queue<Integer> q) {
        if (!q.isEmpty()) {
            return q.peek();
        }
        return -1;
    }

    // Function to find an element in the queue.
    String find(Queue<Integer> q, int y) {
        return q.contains(y) ? "Yes" : "No";
    }
}
