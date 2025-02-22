package oops_concepts.inheritance;

public class Human extends Animal {

    String food = "Rice";

    @Override
    public void eat() {
        System.out.println("Human is eating " + food + " with " + super.food);
    }

    public void sleep() {
        System.out.println("Human is sleeping");
    }

    public void callParentSleep() {
        // Calling the sleep method of the parent class
        super.sleep();
    }


}
