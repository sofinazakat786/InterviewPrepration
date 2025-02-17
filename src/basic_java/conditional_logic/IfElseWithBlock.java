package basic_java.conditional_logic;

public class IfElseWithBlock {
    public static void main(String[] args) {
        System.out.println("**********EXAMPLE 1**********");
        int v1 = 10, v2 = 4;
        final int diff;
        if (v1 > v2) {
            diff = v1 - v2;
            System.out.println("v1 is bigger than v2, diff = " + diff);
        } else {
            diff = v2 - v1;
            System.out.println("v2 is bigger than v1, diff = " + diff);
        }

        System.out.println("**********EXAMPLE 2**********");
        double students = 30.0d, rooms = 4.0d;
        if (rooms > 0.0d) {
            System.out.println("Students: " + students);
            System.out.println("Rooms: " + rooms);
            double avg = students / rooms;
            System.out.println("Avg: " + avg);
        }

    }
}
