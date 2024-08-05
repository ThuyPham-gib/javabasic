package BAITAP.varible1;

//local variable
public class SinhVien {
    // instance variable
    public String ten = "Value";
    static String name;

    // static variable
    public static int soSV = 0;

    public void sinhVien(String ten){
        int id;
        this.ten = ten;
        soSV++;
        id = soSV;
        System.out.println("ID SV la:" +id);

    }

    public void inThongtin(){
        System.out.println("Tên SV:" + ten);
        System.out.println("SL SV:" + soSV);
        System.out.println("Truong:" + ThongTin.truong);
        System.out.println("Khoa:" + ThongTin.khoa);
    }


// Hàm main
    public static void main(String[] args){
        SinhVien SV = new SinhVien();
        //SV.sinhvien();
        SV.inThongtin();
    }
}
