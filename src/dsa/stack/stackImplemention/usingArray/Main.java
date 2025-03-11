package dsa.stack.stackImplemention.usingArray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stack example");
        StackByArray stack = new StackByArray(4);

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        stack.displayElement();
        System.out.println("POP: " + stack.pop());
        stack.displayElement();
        System.out.println("Peek : " + stack.peek());
        stack.displayElement();


        for (int i = 0; i < 3; i++) {
            stack.pop();
            stack.displayElement();
        }


    }
}
