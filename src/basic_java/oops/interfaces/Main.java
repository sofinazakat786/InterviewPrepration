package basic_java.oops.interfaces;

public class Main {
    public static void main(String[] args) {
        TrafficInterface ts1 = new IndianTraffic();
        TrafficInterface ts2 = new AustralianTraffic();

        System.out.println("*******Indian Rules: ");
        ts1.greenIndicator();
        ts1.redIndicator();
        ts1.yellowIndicator();
        System.out.println("******Austrialian rules:  ");
        ts2.greenIndicator();
        ts2.redIndicator();
        ts2.yellowIndicator();

        AustralianTraffic at = new AustralianTraffic();
        at.blueIndicator();
        IndianTraffic it = new IndianTraffic();
        it.voiletIndicator();

    }
}
