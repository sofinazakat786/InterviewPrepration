package design_patterns;

class Singleton {
    private static Singleton instance;

    private Singleton() { //private constructor - prevents instantiation from other classes
    }

    public static Singleton getInstance() { // Public method to provide global access to the instance
        if (instance == null) {
            instance = new Singleton(); // Lazy initialization: Only create instance when needed
        }
        return instance;
    }

    public void showMessage() {  // Example method to demonstrate functionality
        System.out.println("Singleton Instance");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance(); // Accessing Singleton instance using the static method
        obj.showMessage();
    }
}
