package common_questions;

import java.util.Scanner;

public class PatternPrograms {
    /*
 1. Square Hollow Pattern
            * * * *
            *     *
            *     *
            * * * *

     */
    static void squareHollowPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    /*Number Triangle:

            1
            2 2
            3 3 3
            4 4 4 4
    */
    static void numberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*  Number Increasing Pyramid:
            1
            1 2
            1 2 3
            1 2 3 4         */
    static void numberIncreasingPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

/*     Number Increasing Reverse Pyramid:
            1 2 3 4
            1 2 3
            1 2
            1                             */
    static void numberIncreasingReversePyramid(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    Number Changing Pyramid:
    1
    2 3
    4 5 6
    7 8 9 10
     */
    static void numberChangingPyramid(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    // 6. Zero-One Triangle
    static void zeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }

    /* Right Half Pyramid:
            *
            * *
            * * *
            * * * *

     */
    static void rightHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    Reverse Right Half Pyramid:
            * * * *
            * * *
            * *
            *

     */
    static void reverseRightHalfPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* Left Half Pyramid:
            *
            * *
            * * *
            * * * *

     */
    static void leftHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* Reverse Left Half Pyramid:
            * * * *
            * * *
            * *
            *

     */
    static void reverseLeftHalfPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 11. Butterfly Pattern
    static void butterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 12. Diamond Pattern
    static void diamondPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("* ");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("* ");
            System.out.println();
        }
    }

    /* Pascal's Triangle:
            1
          1   1
        1   2   1
      1   3   3   1

     */
    static void pascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j < n - i; j++) System.out.print("  ");
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the patterns: ");
        int n = scanner.nextInt();

        System.out.println("\nSquare Hollow Pattern:");
        squareHollowPattern(n);

        System.out.println("\nNumber Triangle:");
        numberTriangle(n);

        System.out.println("\nNumber Increasing Pyramid:");
        numberIncreasingPyramid(n);

        System.out.println("\nNumber Increasing Reverse Pyramid:");
        numberIncreasingReversePyramid(n);

        System.out.println("\nNumber Changing Pyramid:");
        numberChangingPyramid(n);

        System.out.println("\nZero-One Triangle:");
        zeroOneTriangle(n);

        System.out.println("\nRight Half Pyramid:");
        rightHalfPyramid(n);

        System.out.println("\nReverse Right Half Pyramid:");
        reverseRightHalfPyramid(n);

        System.out.println("\nLeft Half Pyramid:");
        leftHalfPyramid(n);

        System.out.println("\nReverse Left Half Pyramid:");
        reverseLeftHalfPyramid(n);

        System.out.println("\nButterfly Star Pattern:");
        butterflyPattern(n);

        System.out.println("\nDiamond Pattern:");
        diamondPattern(n);

        System.out.println("\nPascal's Triangle:");
        pascalsTriangle(n);

        scanner.close();
    }
}

