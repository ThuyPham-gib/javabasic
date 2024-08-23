package BAITAP.collection;

import java.util.ArrayList;

public class Nhanvien {
    // thông tin nhn vin
    String ten;
    int tuoi;
    String phongBan;


    // Constructor để khởi tạo thông tin của nhân viên
    public Nhanvien(String ten, int tuoi, String phongBan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.phongBan = phongBan;
    }

    // Phương thức để in thông tin nhân viên
    public void inThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Phòng Ban: " + phongBan);
    }
}

