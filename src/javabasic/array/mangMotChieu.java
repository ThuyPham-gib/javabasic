package javabasic.array;

public class mangMotChieu {
    public static void main(String[] args){
        // khai báo mảng lưu giá trị số nguyên
        int soNguyen[] = new int[10];
        // gán giá trị vào mảng
        soNguyen[0] = 5; // gán giá trị 5 vào vị trí thứ 1 (mảng bắt đầu từ 0)
        soNguyen[1] =7;
        // length: từ khóa xử lý độ dài của mảng

        // lấy ra giá trị cụ thể tại vị trí cụ thể
        System.out.println(soNguyen[1]);

        // Truy xuất giá trị trong mảng
        for (int i = 0;  i < 10; i++){// lấy ra tất cả các giá trị
            System.out.println(soNguyen[i]);
        }
    }
}
