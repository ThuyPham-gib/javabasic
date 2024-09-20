package javabasic.tinhdahinh;

public class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class Vietcombank extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class BIDV extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class MB extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

/* Class con Kế thừa từ class Cha
*   Tính chất kế thừa: chỉ gọi variable / constructor từ class cha để sử dụng
*   Tính chất đa hình _Overriding: gọi variable / constructor từ class cha để sử dụng và chỉnh sửa Khác với class
*/




/*
- Nạp chồng (Overloading): cho phép một lớp có nhiều thuộc tính, phương thức cùng tên nhưng với các tham số khác nhau về loại cũng như về số lượng. Khi được gọi, dựa vào tham số truyền vào, phương thức tương ứng sẽ được thực hiện.
- Ghi đè (Overriding): là hai phương thức cùng tên, cùng tham số, cùng kiểu trả về nhưng thằng con viết lại và dùng theo cách của nó,
và xuất hiện ở lớp cha và tiếp tục xuất hiện ở lớp con.
Khi dùng override, lúc thực thi, nếu lớp Con không có phương thức riêng, phương thức của lớp Cha sẽ được gọi, ngược lại nếu có,
phương thức của lớp Con được gọi.
- Đa hình lúc runtime là quá trình gọi phương thức đã được ghi đè trong thời gian thực thi chương trình. Trong quá trình này, một phương thức được ghi đè được gọi thông qua biến tham chiếu của một lớp cha.
 */

/* Upcasting là gì?
Khi biến tham chiếu của lớp cha tham chiếu tới đối tượng của lớp con
*/

/*
🔆 Nạp chồng phương thức trong Java
Nạp chồng phương thức (method overloading)

Nạp chồng phương thức trong java xảy ra nếu một lớp có nhiều phương thức có tên giống nhau nhưng khác nhau về kiểu dữ liệu hoặc số lượng các tham số.

Giả sử bạn phải thực hiện tính tổng của các số đã cho với bất kỳ số lượng các đối số, nếu bạn viết phương thức a(int, int) cho 2 tham số, b(int, int, int) cho 3 tham số điều này có thể gây khó hiểu cho các lập trình viên khác về ý nghĩa của các phương thức đó vì chúng có tên khác nhau.

Lợi ích của nạp chồng phương thức

Sử dụng nạp chồng phương thức giúp tăng khả năng đọc hiểu chương trình.

Các cách nạp chồng phương thức

Có 2 cách nạp chồng phương thức trong java

Thay đổi số lượng các tham số
Thay đổi kiểu dữ liệu của các tham số
Trong java, không thể nạp chồng phương thức bằng cách chỉ thay đổi kiểu trả về của phương thức.
 */
 /*
 🔆 Ghi đè phương thức trong java
Ghi đè phương thức (method overriding)

Ghi đè phương thức trong java xảy ra nếu lớp con có phương thức giống lớp cha.

Nói cách khác, nếu lớp con cung cấp sự cài đặt cụ thể cho phương thức đã được cung cấp bởi một lớp cha của nó được gọi là ghi đè phương thức (method overriding) trong java.

Sử dụng ghi đè phương thức trong java

Ghi đè phương thức được sử dụng để cung cấp cài đặt đặc biệt của một phương thức mà đã được định nghĩa ở lớp cha.
Ghi đè phương thức được sử dụng cho đa hình runtime.
Các nguyên tắc ghi đè phương thức trong java

Phương thức phải có tên giống với lớp cha.
Phương thức phải có tham số giống với lớp cha.
Lớp con và lớp cha có mối quan hệ kế thừa.
  */