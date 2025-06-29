public class ArrayQueue<T> {
    private T[] data;
    private int front;   // points to the first element
    private int rear;    // points to the last element
    private int size;    // number of elements in the queue

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        data = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Adds an element to the rear of the queue
    public void enqueue(T element) {
        if (size == data.length) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % data.length;
        data[rear] = element;
        size++;
    }

    // Removes and returns the front element of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T element = data[front];
        data[front] = null; // help GC
        front = (front + 1) % data.length;
        size--;
        return element;
    }

    // Peeks at the front element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return data[front];
    }

    // Returns true if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns the number of elements in the queue
    public int size() {
        return size;
    }

    // Simple test / demo
    public static void main(String[] args) {
        ArrayQueue<Integer> q = new ArrayQueue<>(5);

        System.out.println("Enqueue 1, 2, 3");
        q.enqueue(91);
        q.enqueue(87);
        q.enqueue(3);

        System.out.println("Peek: " + q.peek());      // should print 1
        System.out.println("Dequeue: " + q.dequeue()); // remove 1
        System.out.println("Peek now: " + q.peek());  // should print 2

        System.out.println("Enqueue 4, 5, 6");
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6); // fills to capacity

        System.out.println("Queue size: " + q.size()); // should be 5

        System.out.print("Dequeue all: ");
        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " ");
        }
        // should print: 2 3 4 5 6
    }
}
