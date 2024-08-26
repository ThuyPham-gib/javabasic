package Auto_java_oop.src.baitap_oop;

public class Info {
    public static void main(String[] args) {
        // Tạo đối tượng nhân viên
        NhanVien nv1 = new NhanVien("a", 25, "BĐ");
        // gọi phương thúc hiển thị nv
        System.out.println(nv1.getName());
        System.out.println(nv1.getAge());
        System.out.println(nv1.getAddress());

    }
}
