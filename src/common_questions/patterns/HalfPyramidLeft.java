package common_questions.patterns;

public class HalfPyramidLeft {
    public static void main(String[] args) {
        /*
    Reverse Right Half Pyramid:
            * * * *
            * * *
            * *
            *

     */
        int n = 4;
        for (int i = n; i >=0 ; i--) {
            for(int j = 1; j<=i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
            
        }
    }
}
