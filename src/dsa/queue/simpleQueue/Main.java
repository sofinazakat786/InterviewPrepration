package dsa.queue.simpleQueue;

public class Main {
    public static void main(String[] args) {
        SimpleQueue simpleQueue = new SimpleQueue(10);
        simpleQueue.display();

        simpleQueue.enqueue(10);
        simpleQueue.enqueue(20);
        simpleQueue.display();

        simpleQueue.dequeue();
        simpleQueue.display();


    }

}
