package javabasic.tinhtruutuong;

public class Interface {

}


/*
Interface là một Template (khuôn mẫu), nó không phải là một lớp đối tượng.
Để khai báo một Interface ta dùng từ khóa interface để thay cho từ khóa class.
Tất cả các hàm trong interface đều ở dạng khai báo và không được định nghĩa (giống lớp abstract).
Là cấu trúc trong OOP cho phép các class khác có thể implements.
Một đối tượng implement một interface thì nó phải khai báo và định nghĩa tất cả các hàm trong Interface.
Interface không thể khởi tạo.
Phương thức trong Interface bắt buộc toàn bộ là các phương thức trừu tượng.
Các phương thức trong Interface chỉ có thể được định nghĩa với khả năng là public và cũng không được định nghĩa nội dung.
Interface có thể được extends với nhau.
1 class có thể implements nhiều Interface.
 */

/*
Sự khác nhau giữa interface và abstract class
Tất cả phương thức trong interface luôn luôn(được hiểu) là abstract.
Các phương thức trong abstract class là abstract hoặc không phải là abstract.
Có thể implements nhiều interface nhưng không thể extends trực tiếp nhiều class.
Các phương thức trong interface luôn luôn phải để là public, khác với abstract class có thể là public hoặc protected.
Sự giống nhau giữa interface và abstract class
Không thể tạo một biến kiểu interface hoặc abstract class.
Nếu là phương thức abstract thì phải được khai báo lại trong class con.
Cả interface và abstract class đều có tính kế thừa.
Khi nào thì sử dụng interface, khi nào sử dụng abstract class
Khi một nhóm đối tượng có cùng bản chất kế thừa từ một class thì sử dụng abstract class.

Khi một nhóm đối tượng không có cùng bản chất nhưng chúng có hành động giống nhau thì sử dụng interface.
 */