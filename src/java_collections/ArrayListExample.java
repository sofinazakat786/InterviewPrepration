package java_collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Hello");
        al.add("Java");
        System.out.println(al);
        al.add(0, "first");

        System.out.println(al);
        //test
        boolean test = al.contains("Java");
        System.out.println("Java present: "+ test);

        int index = al.indexOf("Java");
        System.out.println("index of Java: "+ index);
        boolean isEmpty = al.isEmpty();
        System.out.println("Array empty: "+ isEmpty);
        int size = al.size();
        System.out.println("Size : "+ size);

        for(int i = 0; i< al.size();i++){
            System.out.println(i+ " : "+ al.get(i));
        }


    }
}
