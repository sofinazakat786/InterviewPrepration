package basic_java.oops.interfaces;

public class AustralianTraffic implements TrafficInterface {


    public void blueIndicator() {
        System.out.println("Blue means taking right");
    }

    @Override
    public void greenIndicator() {
        System.out.println("Green means stop ");

    }

    @Override
    public void redIndicator() {
        System.out.println("Red means ready to go");

    }

    @Override
    public void yellowIndicator() {
        System.out.println("Yellow means stop");

    }
}
