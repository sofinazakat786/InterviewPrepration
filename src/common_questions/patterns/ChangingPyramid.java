package common_questions.patterns;

public class ChangingPyramid {
    public static void main(String[] args) {
        /*
    Number Changing Pyramid:
    1
    2 3
    4 5 6
    7 8 9 10
     */
        int n = 4;
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter ++;
            }
            System.out.println();

        }
    }
}
