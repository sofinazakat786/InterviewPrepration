package basic_java.oops.abstraction;

public abstract class ParentAircraft {


    public void engine() {
        System.out.println("Follow Engine Guidelines");
    }

    public void safetyGuidlines() {
        System.out.println("Follow safety Guideines");
    }

    public abstract void bodyColor();
}
