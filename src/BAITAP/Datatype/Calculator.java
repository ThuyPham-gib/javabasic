package BAITAP.Datatype;

public class Calculator {

    // Hàm tính tổng 2 số nguyên

    static int sum (int a, int b){
        return a + b;
    }


    // Hàm tính tích 2 số thực

    static int product (int c, int d){
        int y = c * d;
        return y;
    }

    //hàm main
    public static void main (String[] args){
        int x = sum(16, 8);
        System.out.println(x);

        int y = product(16,8);
        System.out.println(y);

    }
}
