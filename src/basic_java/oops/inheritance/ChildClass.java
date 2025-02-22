package basic_java.oops.inheritance;

public class ChildClass extends ParentClass {

    public void engine() {
        System.out.println("new engine");
    }

    public void color() {
        System.out.println(color);
    }

    @Override
    public void audioSystem() {
        System.out.println("Upgraded audio system implemented");
    }

    public static void main(String[] args) {
        ChildClass cs = new ChildClass();
        cs.color();
        cs.engine();
        cs.gear();
        cs.audioSystem();

        ParentClass pc = new ChildClass();
        pc.audioSystem();
    }
}
