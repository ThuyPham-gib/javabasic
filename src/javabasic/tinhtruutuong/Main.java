package javabasic.tinhtruutuong;

public class Main {
    public static void main(String[] args) {


        Shape circle = new Circle("red", 12d);
        Shape rectangle = new Rectangle("blue", 4, 3);


        System.out.println("Color circle: " + circle.getColor()); //getColor() được xem như là một method sử dụng chung cho tất cả các class con.
        System.out.println("Area circle: " + circle.area()); // area() là abstract method cho nên các class con bắt buộc phải implement lại area(), nếu không chúng ta sẽ bị lỗi biên dịch.
        //area() đóng vai trò là một khuôn mẫu cho các class con. Các class con dựa vào khuôn mẫu đó mà triển khai riêng cho nó.


        System.out.println("Rectangle circle: " + rectangle.getColor());
        System.out.println("Area rectangle: " + rectangle.area());
    }
}

/*
Tránh duplicate code và tăng tính tái sử dụng code.
Tăng tính minh bạch nhờ vào việc áp dụng trừu tượng để tạo khuôn mẫu chung cho các đối tượng. Nhờ vào đó chúng ta có thể biết được luồng chạy của các object cùng loại(extends từ một superclass) mà không cần đi đến chi tiết.
 */