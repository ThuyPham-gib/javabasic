package java_oop.object;

import javax.naming.Name;

public class SinhVien {
    private String name;// = "abc";
    private int age;
    private String address;
    private String className;// = "Java basic";


    // Hàm xây dựng không có tham số
    public SinhVien(){


        // Cách 2: khởi tạo giá trị của biến trong class thông qua hàm sử dụng
        name = "Thuy";
        age = 25;
        address = "Binh Dinh";
        className = "Java basic";
    }
// Hàm xây dựng có tham số
    public SinhVien(String name, int age, String address, String className){

        this.name = name;
        this.age = age;
        this.address =  address;
        this.className = className;

        // ý nghĩa "This": chỉ thị biến trong class = với giá trị mà trong phthuc truyền vô
    }


    // khởi tạo hầm xaay dựng,  chuúng ta có ngtac sau: không được trùng



    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Truy xuất thông tin
    public String getName(){
        return name;
    }
    public String getClassName(){
        return className;
    }
}
