package basic_java.Variables;

public class StaticVar {

    String name;
    static String address;    // static variables can't be accessed by object
    static String city = "Bangalore";  // All static variables are class variables

    static int i = 0;

    public StaticVar(String name, String street) {
        this.name = name;     // local variables
        this.address = street;
        i++;
        System.out.println(i);
//        this.city = city;

    }

    public void getAddress() {
        System.out.println(address + " " + city);

    }
    public static void getCity(){
        System.out.println(city);
    }


    public static void main(String[] args) {
        StaticVar obj1 = new StaticVar("Mohan", "Mahadevpura");
        StaticVar obj2 = new StaticVar("Mohan", "Mahadevpura");
        System.out.println(obj1.name);
        obj2.getAddress();
        getCity();  // static methods can be called without createing object


    }
}
