package javabasic.tinhtruutuong;

public class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(String color,double length,double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }
}