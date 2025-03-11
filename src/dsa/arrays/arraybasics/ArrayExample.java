package dsa.arrays.arraybasics;

public class ArrayExample {

    public static void main(String[] args) {
        // Declare and initialise array
        int marks[] = {10, 20, 30};

        // Declare
        int failedStudentMarks[] = new int[5];

        // Access the data
        System.out.println("Marks of students: ");
        System.out.println("--------------------");
        System.out.println("Stud1\tStud2\tStud3");
        System.out.println("--------------------");
        // travering by for loop
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-8d", marks[i]);
        }
        System.out.println();
        // Traversing by forEach loop
        for (int value : marks) {
            System.out.printf("%-8d", value);
        }
        System.out.println("\n--------------------");

        // Modify the elements of array
    }
}
