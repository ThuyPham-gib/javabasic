package baitap_oop;

public class NhanVien {
    private String name;
    private int age;
    private String address;

// Contructor
    public NhanVien(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;

    }

    // Getter Name: click right > Genarate > getter > select variable > click OK

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    //
}
