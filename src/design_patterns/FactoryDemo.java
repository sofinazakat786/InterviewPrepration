package design_patterns;

import java.sql.ShardingKey;

interface Shape {
    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class ShapeFactory {
    public static Shape getShape(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        } else if (type.equalsIgnoreCase("Circle")) { // If type is Circle, return a new Circle object
            return new Circle();
        } else if (type.equalsIgnoreCase("Rectangle")) { // If type is Rectangle, return a new Rect object
            return new Rectangle();
        }
        else{
            throw new IllegalArgumentException("Shape is undefined");
        }
//        return null;

    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        try {
            Shape shape1 = ShapeFactory.getShape("circle");
            shape1.draw();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            Shape shape2 = ShapeFactory.getShape("dkj");
            shape2.draw();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
