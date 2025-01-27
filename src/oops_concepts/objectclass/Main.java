package oops_concepts.objectclass;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Harry", "harry@gmai.com", 123);
        Student student2 = new Student("Aman", "aman@gmai.com", 452);


        student1.showAllDetails();
        student2.showAllDetails();

        Student student4 = new Student();
        student4.showName("Singh");


    }
}
