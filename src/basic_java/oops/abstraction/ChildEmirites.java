package basic_java.oops.abstraction;

public class ChildEmirites extends ParentAircraft {

    public static void main(String[] args) {
        ChildEmirites c = new ChildEmirites();
        c.engine();
        c.safetyGuidlines();
        c.bodyColor();
    }

    @Override
    public void bodyColor() {
        System.out.println("red color on the body");
    }
}
