package javabasic.Inheritance;

public class Student extends persons {
    public Student(String name, int age, float height){
        super(name,age,height);// không báo lỗi vì đảm bảo đc đúng cấu trúc hàm xd


    }

 //   public string name;
 //   public int age;
 //   public float height;

 //   public Student(String name, int age, float height) {
 //       this.name = name;
   //     this.age = age;
    //    this.height = height;
   // }

//    public void getInfo() {
//        System.out.println("Name:" + this.name);
//        System.out.println("Age:" + this.age);
//        System.out.println("Height:" + this.height);
//    }

    public static void main(String[] args) {
        Student student = new Student("ABC", 30, 150 );
        student.getInfo();

    }
}