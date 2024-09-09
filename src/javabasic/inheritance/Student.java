package javabasic.inheritance;

public class Student extends Persons {
    public String universityName;

    public Student(String name, int age, float height, String universityName){
        super(name,age,height);// không báo lỗi vì đảm bảo đc đúng cấu trúc hàm xd
        this.universityName = universityName;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("University Name:" + this.universityName);
    }


    public static void main(String[] args) {
        Student student = new Student("ABC", 30, 150, "Bình Định" );
        student.getInfo();

    }

    // Class con kế thừa Class cha, thì sẽ được hưởng toàn bộ các thuộc tính, constructor mà class cha đã define
    // Define thêm các variable, constructor dựa vào từ class cha
    //
}