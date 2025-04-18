package dsa.queue.simpleQueue;

public class SimpleQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public SimpleQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Insert data at the rear (Enqueue)
    public void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full!");
            return;
        }
        rear++;
        queue[rear] = data;
        System.out.println(data + " inserted into queue.");
    }

    // Remove the front element (Dequeue)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        int removedData = queue[front];
        front++;
        System.out.println(removedData + " removed from queue");

        // Reset queue when empty
        if (isEmpty()) {
            front = 0;
            rear = -1;
        }
    }

    // Peek at the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    // Display elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
