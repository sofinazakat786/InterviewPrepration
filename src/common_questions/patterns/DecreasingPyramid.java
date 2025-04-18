package common_questions.patterns;

public class DecreasingPyramid {
    public static void main(String[] args) {
        /*     Number Increasing Reverse Pyramid:
            1 2 3 4
            1 2 3
            1 2
            1                             */
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
