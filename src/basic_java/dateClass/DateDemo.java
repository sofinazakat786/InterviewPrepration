package basic_java.dateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Date Now in Standard format: "+ d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
        System.out.println("Simple format: "+ sdf.format(d));




    }
}
