package Auto_java_oop.src.java_oop.object;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {


        // khởi tạo đối tượng class SV
        SinhVien sv1 = new SinhVien();
        sv1.printInfoSinhVien("Van A", 25, "bđ", "leanrn_auto"); // chưa chạy ra được kq
        System.out.println("-----------------");


        SinhVien sv2 = new SinhVien();
        sv2.printInfoSinhVien();

//        ArrayList <String> arrayList =  new ArrayList<>();
//        arrayList.add("value");
//        arrayList.add("value2");
//
//        ArrayList<SinhVien> listSinhViens = new ArrayList<>();
//        listSinhViens.add(sv1); // thêm bộ data sv1 vào vị trí đầu tiên trong array list
//
//        for (SinhVien sv : listSinhViens){
//
//            sv.printInfoSinhVien();
//        }
        //==> không viết như vậu, Sai syntax code

    }
}
