package dsa.stack.stackImplemention.usingArray;

public class StackByArray {
    private int[] array;
    private int maxSize;
    private int top = -1;

    public StackByArray(int size) {
        this.maxSize = size;
        array = new int[maxSize];
        top = -1;
    }

    // Check Stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    //Push operation
    public void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
            return;
        } else {
            top++;
            array[top] = data;
        }
    }


    //Pop Operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int popElement = array[top];
            top--;
            return popElement;
        }
    }

    //Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!");
            return -1;
        } else {
            return array[top];
        }
    }

    // Display
    public void displayElement() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

}
