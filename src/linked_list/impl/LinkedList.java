package linked_list.impl;

public class LinkedList {
    Node head;

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void insertAtStart(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position == 0){
            insertAtStart(data);
        }else{
            Node temp = head;
            for(int i = 0; i < position - 1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
    }
}
