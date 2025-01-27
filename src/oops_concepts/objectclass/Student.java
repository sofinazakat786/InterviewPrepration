package oops_concepts.objectclass;

public class Student {
    String name;
    String email;
    int studentId;

    //Construstor: intilize state of object
    //       methods --> name must be equal class name
    //               --> no return type - not even void
    //Constructor overloading => constructor with same name but different parameters


    public Student(){

    }
    public Student(String n, String e, int i){
        this.name = n;
        this.email = e;
        this.studentId = i;
    }
    public void showName(){
        System.out.println("Name: "+ name);
    }
    public void showName(String lastName){
        System.out.println("last Name: "+ lastName);
    }
    public void showAllDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Email: "+ email);
        System.out.println("Id: "+studentId);
    }

}
