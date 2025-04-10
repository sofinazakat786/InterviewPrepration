package common_interview_questions.patterns;

public class NumberTriangle {
    public static void main(String[] args) {
/*Number Triangle:

            1
            2 2
            3 3 3
            4 4 4 4
    */
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
