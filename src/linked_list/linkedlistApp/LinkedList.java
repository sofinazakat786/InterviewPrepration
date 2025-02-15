package linked_list.linkedlistApp;

public class LinkedList {

    Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            insertAtStart(data);
        } else {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
    }

    //delete from begining 
    public void deleteFromBegining() {
        if (head == null) {
            System.out.println("List is empty !! No nodes to delete");
        }

        head = head.next;

    }

    //delete from end 
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty !! No nodes to delete");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

    }

    //delete from position 
    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("List is empty !! No nodes to delete");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position is out of bound!!");
        }
        temp.next = temp.next.next;

    }

    public boolean searchData(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;

            }
            temp = temp.next;
        }
        return false;
    }
}
