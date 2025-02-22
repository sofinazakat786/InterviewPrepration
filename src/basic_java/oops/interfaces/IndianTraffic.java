package basic_java.oops.interfaces;

public class IndianTraffic implements TrafficInterface {

    public void voiletIndicator() {
        System.out.println("indian voilet");
    }

    @Override
    public void greenIndicator() {
        System.out.println("Green means Go");
    }

    @Override
    public void redIndicator() {
        System.out.println("Red means Stop");

    }

    @Override
    public void yellowIndicator() {
        System.out.println("Yellow means ready to Go");

    }
}
