package BAITAP.person;

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
}
