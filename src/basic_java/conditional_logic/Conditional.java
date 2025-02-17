package basic_java.conditional_logic;

public class Conditional {
    public static void main(String[] args) {
        int value1 = 7;
        int value2 = 5;
        int maxValue = value1 > value2 ? value1 : value2;
        System.out.println("Max value: " + maxValue);
    }
}
