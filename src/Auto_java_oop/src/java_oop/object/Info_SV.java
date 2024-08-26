package Auto_java_oop.src.java_oop.object;
// Class này để truy xuất thồng tin ở class SinhVien
public class Info_SV {
    public static void main(String[] args) {

        // Khai báo đối tượng clss để truy xuất thông tin trong 1 class
        SinhVien sv1 = new SinhVien(); //tương ứng với hàm xây dựng kh tham số

        // gọi các thành phần trong class thông qua đối tượng, thoongqua hàm xây dựng
        System.out.println(sv1.getName());
        System.out.println(sv1.getClassName());
        System.out.println(sv1.getAge());
        System.out.println(sv1.getAddress());


        // khởi tạo đối tượng cho class SinhVien với cấu trúc hàm xây dựng có tham số

        SinhVien sv2 = new SinhVien("Name", 25,"BinhDinh","javabassic");

        System.out.println("----");
        System.out.println(sv2.getName());
        System.out.println(sv2.getClassName());
        System.out.println(sv2.getAge());
        System.out.println(sv2.getAddress());

        // Truy xuất thông tin class thông qua khởi tạo đối tượng Annonymous (không có tên đối tượng)
        System.out.println("----");
        System.out.println(new SinhVien().getName());

    }
    // Cách khởi tạo Object của class, sẽ có 3 cách
    // C1: SinhVien sinhVien = new SinhVien();  ==> Khởi tạo đối tượng(Object) đại diện cho 1 class
    // C2: Phải có static thì mới gọi trực tiếp 1 hàm từ 1 class sang class khác
    // C3: new Calculation().fact(5);
    // SinhVien sv = new SinhVien();
}

