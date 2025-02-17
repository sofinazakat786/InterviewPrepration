package design_patterns;

interface Animal {
    void makeSound();
}

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

abstract class AnimalFactory {
    abstract Animal createAnimal();
}

class DogFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.makeSound();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.makeSound();

    }
}
