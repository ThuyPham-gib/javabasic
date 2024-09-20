package javabasic.tinhdahinh;

class Shape {
    void draw() {
        System.out.println("Drawing...");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle...");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing triangle...");
    }
}

public class Tinhdahinh3 {
    public static void main(String[] args) {
        Shape s;
        System.out.println("vi dụ về tinh da hinh");
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}
/*
kế thừa nhiêu tầng?
 */