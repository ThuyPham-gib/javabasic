package javabasic.tinhdahinh;


class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Napchong {
    public static void main(String[] args) {
        System.out.println("Ví dụ về nạp chồng:");
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
    }
}


/*
 Nạp chồng phương thức: thay đổi số lượng các tham số
Trong ví dụ này, chúng ta cần tạo 2 phương thức, phương thức add() đầu tiên thực hiện việc tính tổng của 2 số, phương thức thứ hai thực hiện việc tính tổng của 3 số. Sử dụng phương thức static để gọi hàm thông qua tên class thay vì phải tạo thể hiên của lớp.
 */