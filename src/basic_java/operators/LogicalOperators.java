package basic_java.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println(x && y); // false (both must be true)
        System.out.println(x || y); // true (at least one is true)
        System.out.println(!x);     // false (inverts the value)

    }
}
