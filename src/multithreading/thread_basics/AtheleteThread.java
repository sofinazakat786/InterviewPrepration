package multithreading.thread_basics;

public class AtheleteThread extends Thread{

    private int bibNumber;

    public AtheleteThread (String name,int priority,  int bibNumber){
        this.setName(name);
        this.setPriority(priority);
        this.bibNumber = bibNumber;
    }
    // getters and setters
    public int getBibNumber() {
        return bibNumber;
    }
    public void setBibNumber(int bibNumber) {
        this.bibNumber = bibNumber;
    }

    @Override
    public void run() {
        double distanceKM = 10;
        double steps = 0.001;

        for (double i = 0; i <= distanceKM; i += steps) {
            if (Math.abs(i - distanceKM) < steps) {
                System.out.println("Athelete No " + bibNumber +" named "+ this.getName()+ " has finished the race");
                break;
            }
        }
    }

}
