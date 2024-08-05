package BAITAP.Datatype;

public class Calculator {

    // Hàm tính tổng 2 số nguyên
    //Khởi tạo hàm và có kiểu dữ liệu tra về thì phải có RETURN
    static int sumReturn(int a, int b) {
        System.out.println(a+b);
        return a + b;
    }


    // Void là kiểu hàm động, diễn tả thực hiện hàm đó Và Không có RETURN
    public void sumMethod(int a, int b) {
        System.out.println(a+b);
    }

    // Hàm tính tích 2 số thực, Kiểu float
    //Kiểu dữ liệu khai báo và trả về phải trùng nhau

    //Cách 1, không thực hiện phép tính trong hàm
    static float product(float c, float d) {
        return c * d;
    }

    //Cách 2, không thực hiện phép tính trong hàm
    static float product_1(float c, float d) {
        float y = c * d;
        return c * d;
    }

    //hàm main
    public static void main(String[] args) {
        sumReturn(16, 8);

        System.out.println(product(16F, 8F));

    }
}
