package javabasic.tinhtruutuong;

// File Shape.java
public abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double area();

    String getColor() {
        return this.color;
    }
}
