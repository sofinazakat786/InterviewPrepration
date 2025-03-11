package dsa.linked_list.doublylinkedlist;


public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Adding elements to the front of the list
        dll.addFront(10);
        dll.addFront(20);
        dll.addFront(30);

        // Displaying the list forward
        System.out.println("Forward Display after adding to front:");
        dll.displayForward(); // Output: 30    20    10

        // Adding elements to the rear of the list
        dll.addRear(40);
        dll.addRear(50);

        // Displaying the list forward
        System.out.println("Forward Display after adding to rear:");
        dll.displayForward(); // Output: 30    20    10    40    50

        // Displaying the list backward
        System.out.println("Backward Display:");
        dll.displayBackward(); // Output: 50    40    10    20    30

        // Deleting from the front
        dll.deleteFront();
        System.out.println("Forward Display after deleting from front:");
        dll.displayForward(); // Output: 20    10    40    50

        // Deleting from the end
        dll.deleteEnd();
        System.out.println("Forward Display after deleting from end:");
        dll.displayForward(); // Output: 20    10    40

        // Displaying the list backward after deletions
        System.out.println("Backward Display after deletions:");
        dll.displayBackward(); // Output: 40    10    20
    }
}