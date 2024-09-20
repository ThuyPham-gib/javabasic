package javabasic.tinhtruutuong;

abstract class BaseClass
{
    // phương thức ở mức protected
    abstract protected void hello();

    // Phương thức ở mức public
    abstract public void hi();
}

/*
Trừu tượng trong OOP cho phép ẩn đi quá trình thực thi bên trong và chỉ hiển thị những tính năng thiết yếu tới người dùng.
 tính trừu tượng được thể hiện thông qua abstract class và interface.

Áp dụng trừu tượng vào lập trình chúng ta sẽ có những ưu điểm:

Một abstract class được khai báo bằng từ khoá abstract.
Một abstract method là một method được khai báo không có thân hàm.
Các class con thừa kế abstract class phải implement abstract method.
Abstract class không thể khởi tạo .
Đơn giản hoá đối tượng bằng cách đưa ra các thuộc tính và phương thức mà nó có và thực hiện.
Tập trung vào tính cốt lỗi của đối tượng. Ví dụ khi bạn xem method của class bất kỳ trong java chúng đều có mô tả rõ ràng về cách sử dụng, giá trị trả về, tham số truyền vào etc là bạn có thể sử dụng được.
 */

/*
Abstract Class là gì ?
Nó là một class
Nó chứa phương thức trừu tượng
Các class khi kế thừa một abstract class sẽ phải định nghĩa lại các phương thức trừu tượng của abstract class
Một class chỉ có thể kế thừa 1 lớp trừu tượng
Có 2 loại method là abstract method và method thường:
abstract method là method trống không có thực thi.
method thường là method có thực thi.
không thể khởi tạo đối tượng của abstract class
Không hỗ trợ đa kế thừa.
Phương thức abstract của abstract class không được phép khai báo nội dung phương thức. Nó chỉ có thể định nghĩa tên cũng như các tham số đầu vào.
Mức truy cập các hàm của abstract phải ở public hoặc protected để lớp kế thừa có thể định nghĩa lại và các thuộc tính của lớp abstract không được khai báo abstract. Ví dụ : khai báo 1 abstract class
 */