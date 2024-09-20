package javabasic.tinhdahinh;

class Adders {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

public class napchongthaydoikieudulieu {
    public static void main(String[] args) {

        System.out.println("Ví dụ về nạp chồng:");
        System.out.println(Adders.add(11, 11));
        System.out.println(Adders.add(12.3, 12.6));
    }
}

/*
Phương thức add() đầu tiên nhận 2 đổi số có kiểu giá trị là integer, phương thức thứ hai nhận 2 đổi số có kiểu giá trị là double.
 */


/*
  Tại sao không thể nạp chồng phương thức bằng cách chỉ thay đổi kiểu trả về của phương thức?
 không thể nạp chồng phương thức bằng cách chỉ thay đổi kiểu trả về của phương thức bởi vì không biết phương thức nào sẽ được gọi.
 */
/*
Có thể nạp chồng phương thức main() không?
có thể nạp chồng n phương thức main. Nhưng  chỉ gọi phương thức main() có tham số truyền vào là một mảng String.
 */