package multithreading.thread_basics;

import multithreading.thread_basics.AtheleteThread;

public class Main {
    public static void main(String[] args) {

        AtheleteThread athlete1 = new AtheleteThread("John",Thread.MAX_PRIORITY, 12352);
        AtheleteThread athlete2 = new AtheleteThread("Dao",Thread.MIN_PRIORITY, 25664);

        athlete1.start();
        athlete2.start();
    }
    private static void runRace(int bibNumber) {

    }
}
