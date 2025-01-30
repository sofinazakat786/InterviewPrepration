package arrays.arrayADT;

public class Main {
    public static void main(String[] args) {
        ArrayADT array = new ArrayADT(5);
        array.getSize();
        array.display();
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.insert(60);
        array.display();
    }
}
