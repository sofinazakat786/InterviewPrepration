package dsa.arrays.multidimensional;

public class MultidimensionalArray {

    public static void main(String[] args) {

        // Initializing 2D Array [2]->rows [3]->columns
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("size of a: " + a.length);
        System.out.print("Element at 2nd row 1st column: ");
        System.out.println(a[1][0]);
        System.out.println("2 x 3 Matrix:");
        System.out.println(" ______");

        for (int i = 0; i < a.length; i++) {
            System.out.print("|");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("|");
        }

        System.out.println(" ------");
    }
}
