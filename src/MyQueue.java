import java.util.LinkedList;

public class MyQueue {
    LinkedList<Integer> t;

    MyQueue() {
        t = new LinkedList<Integer>();
    }

    boolean isEmpty() {
        return(t.isEmpty());
    }

    void enqueue(int x) {
        t.add(x);
    }

    int dequeue() {
        return (t.removeFirst());
    }
}
