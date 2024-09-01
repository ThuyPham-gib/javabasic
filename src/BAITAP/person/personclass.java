package BAITAP.person;

import Auto_java_oop.src.java_oop.object.Company;
import BAITAP.companypackage.classCompany;

public class personclass {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    // Hàm xây dựng
    public personclass(String name, int age, String gender, String address, String phone){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    // Hàm get
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        // tạo đối tượng person
        personclass person = new personclass("A" ,12, "female" , "123Str", "152355");
        // in thông tin
        inforclass.printPersonInfo(person);
        // tạo đối tượng company và in thông tin cơ bản
        classCompany company = new classCompany(person);
        company.displayinforclass();
    }
}
