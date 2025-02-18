package stack.stackImplemention.usingLinkedList;

public class StackLinkedList {

    // Node class for linked list implementation
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Top of the stack
    private Node top;

    // Constructor
    public StackLinkedList() {
        this.top = null;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push an element onto the stack
    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack Underflow: Cannot pop from an empty stack.");
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // Peek the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty: Cannot peek.");
        }
        return top.data;
    }

    // Display all elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!");
        } else {
            Node temp = top;
            System.out.print("Display: ");
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Get the size of the stack
    public int size() {
        int count = 0;
        Node temp = top;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
