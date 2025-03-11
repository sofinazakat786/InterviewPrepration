package dsa.arrays.multidimensional;

public class MinOf3x3Array {
    public static void main(String[] args) {
        // Initializing 2D Array [2]->rows [3]->columns
        int[][] a = {{85, 20, 34}, {49, 56, 6}, {49, 96, 31}};
        int[] array1 = minNumber(a);
        int minNumber = array1[0];
        System.out.println("Minimum number is :" + minNumber);
        int[] array = maxNumber(a);
        int maxNumber = array[0];
        System.out.println("Maximum number is :" + maxNumber);

        System.out.println("Maximum number in minColumn number: " + maxNumberInMinColumn(a));
        System.out.println("Minimum number in maxColumn number: " + minNumOfMaxCol(a));
        System.out.println("Minimum number in maxRow: " + minNumOfMaxRow(a));
        System.out.println("Maximum number in minRow: " + maxNumOfMinRow(a));


    }

    public static int[] minNumber(int[][] a) {
        int minNumber = a[0][0];
        int columnOfMinNumber = 0;
        int rowOfMinNumber = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < minNumber) {
                    minNumber = a[i][j];
                    columnOfMinNumber = j;
                    rowOfMinNumber = i;
                }
            }
        }
        int array[] = {minNumber, columnOfMinNumber, rowOfMinNumber};
        return array;
    }

    public static int maxNumberInMinColumn(int[][] a) {
        int[] array = minNumber(a);
        int minColumn = array[1];

        int maxNumberInMinColumn = a[0][minColumn];
        int i = 0;
        while (i < 3) {
            if (a[i][minColumn] > maxNumberInMinColumn) {
                maxNumberInMinColumn = a[i][minColumn];
            }
            i++;
        }
        return maxNumberInMinColumn;
    }

    public static int[] maxNumber(int[][] a) {
        int maxNumber = a[0][0];
        int maxColumn = 0;
        int maxRow = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxNumber) {
                    maxNumber = a[i][j];
                    maxColumn = j;
                    maxRow = i;

                }
            }
        }

        int[] array = {maxNumber, maxColumn, maxRow};
        return array;
    }

    public static int minNumOfMaxCol(int[][] a) {

        int[] array = maxNumber(a);
        int maxColumn = array[1];


        int minNumberInMaxColumn = a[0][maxColumn];
        for (int i = 0; i < 3; i++) {
            if (a[i][maxColumn] < minNumberInMaxColumn) {

                minNumberInMaxColumn = a[i][maxColumn];
            }

        }
        return minNumberInMaxColumn;
    }

    public static int minNumOfMaxRow(int[][] a) {

        int[] array = maxNumber(a);
        int maxRow = array[2];


        int minNumberInMaxRow = a[maxRow][0];
        for (int i = 0; i < 3; i++) {
            if (a[maxRow][i] < minNumberInMaxRow) {

                minNumberInMaxRow = a[maxRow][i];
            }

        }
        return minNumberInMaxRow;
    }

    public static int maxNumOfMinRow(int[][] a) {

        int[] array = minNumber(a);
        int minRow = array[2];


        int minNumberInMaxRow = a[minRow][0];
        for (int i = 0; i < 3; i++) {
            if (a[minRow][i] > minNumberInMaxRow) {

                minNumberInMaxRow = a[minRow][i];
            }

        }
        return minNumberInMaxRow;
    }
}
