package oops_concepts.inheritance;

public class Child extends Parent {

    static String name = "Child";

    public Child() {
        super();
        System.out.println("Child Constructor");
    }

    public void getData() {

        super.getData();
        System.out.println("I am in child");
    }

    public void childDemo() {
        System.out.println(super.name);

    }


    public static void main(String[] args) {
        Child c = new Child();
        c.getData();
        System.out.println(name);

    }
}
