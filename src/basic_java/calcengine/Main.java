package basic_java.calcengine;

public class Main {
    public static void main(String[] args) {
        double value1 = 100d;
        double value2 = 0d;
        double result = 0.0d;  // Initialize result to a default value
        char opCode = 'd';

        switch (opCode) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
//                if (value2 != 0) result = value1 / value2;
//                else System.out.println("Division by zero is not allowed.");
                result = value2 != 0 ? value1 / value2 : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);

        }
        System.out.println("Result: " + result);
    }
}
