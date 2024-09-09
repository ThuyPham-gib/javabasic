package javabasic.tinhdahinh;

public class motorbike extends Bike {
    void run() {
        System.out.println("Chạy khoảng 40km/giờ");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Bike bk = new motorbike();
        System.out.println("Ví dụ về tính đa hình:");
        bk.run();
    }
}