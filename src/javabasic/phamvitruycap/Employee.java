package javabasic.phamvitruycap;

public class Employee {
    // phạm vi truy cập

    private String name = "ABC";
    private int age = 22;

    public String company = "HGJ";

    private void getInformation(){
        System.out.println(name);
        System.out.println(age);
    }


    // phạm vi truy cập pro: được truy cập sang class khác nhưng cùng nằm trong 1 package
    protected void getInforProtected(){

        System.out.println(name);
        System.out.println(age);
    }
    // Truy cập được mọi nơi tong cùng prj
    public String getName(){
        return name;
    }

    public String getCompany(){
        return company;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInforProtected();
    }
}
