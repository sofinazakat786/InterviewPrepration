package common_interview_questions.patterns;

public class Pyramids {

    public static void main(String[] args) {

        System.out.println("Pattern 1:");
        printPattern1();

        System.out.println("\nPattern 2:");
        printPattern2();

        System.out.println("\nPattern 3:");
        printPattern3();

        System.out.println("\nPattern 4:");
        printPattern4();

    }

    // Decreasing Pyramid with Incremental Numbers
    public static void printPattern1() {
        int k = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    // Increasing Pyramid with Incremental Numbers
    public static void printPattern2() {
        int l = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(l + " ");
                l++;
            }
            System.out.println();
        }
    }

    // Increasing Pyramid with Decremental Numbers
    public static void printPattern3() {
        int k = 10;
        for (int i = 1; i <= 4; i++) { // Start from 1 to avoid empty first line
            for (int j = 0; j < i; j++) {
                System.out.print(k + " ");
                k--;
            }
            System.out.println();
        }
    }

    // Increasing Pyramid with Fixed Numbers
    public static void printPattern4() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < i + 2; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
