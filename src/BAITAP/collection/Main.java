package BAITAP.collection;

import java.util.ArrayList;

public class Main {
    // Hàm để thêm thông tin cơ bản của nhân viên vào danh sách
    public static void themNhanVien(ArrayList<Nhanvien> danhSach, String ten, int tuoi, String phongBan) {
        Nhanvien nv = new Nhanvien(ten, tuoi, phongBan);
        danhSach.add(nv);
    }

    public static void main(String[] args) {
        // Tạo danh sách lưu thông tin các nhân viên
        ArrayList<Nhanvien> danhSachNhanVien = new ArrayList<>();

        // Thêm thông tin nhân viên vào danh sách
        themNhanVien(danhSachNhanVien, "Nguyen Van A", 30, "Phong A");
        themNhanVien(danhSachNhanVien, "Le Thi B", 25, "Phong B");

        // In thông tin nhân viên từ danh sách bằng vòng lặp FOR cơ bản
        System.out.println("Danh sách nhân viên:");
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            System.out.println("Nhân viên " + (i + 1) + ":");
            danhSachNhanVien.get(i).inThongTin();
            System.out.println();
        }
    }
}
