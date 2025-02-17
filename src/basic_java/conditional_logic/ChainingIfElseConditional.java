package basic_java.conditional_logic;

public class ChainingIfElseConditional {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 5;
        if (value1 > value2)
            System.out.println("Value1: " + value1 + " is bigger than value2: " + value2);
        else if (value2 > value1)
            System.out.println("Value2: " + value2 + " is bigger than value1: " + value1);
        else
            System.out.println("value1 is equal to value2");

    }
}
