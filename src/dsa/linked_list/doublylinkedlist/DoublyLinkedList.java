package dsa.linked_list.doublylinkedlist;

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    //add the data to front
    public void addFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    //add the data to end(rear)
    public void addRear(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    //delete on front
    public void deleteFront() {
        if (head == null) {
            System.out.println("list is empty!");
            return;
        } else {
            head = head.next;
            head.prev = null;

        }
    }

    //delete on end
    public void deleteEnd() {
        if (tail == null) {
            System.out.println("List is empty!");
            return;
        }
        if (tail.prev == null) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }


    //display backwards
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + "\t");
            current = current.prev;
        }
        System.out.println();

    }

    //display forward
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "\t");
            current = current.next;
        }
        System.out.println();
    }


}
