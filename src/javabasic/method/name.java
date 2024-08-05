package javabasic.method;

public class name {

    public static String company_name = "Vina";
    public static String address  = "QN";
    public static String phone = "123";
    public static String email = "Vina@gmail.com";

    public static void getInfoname (){
        System.out.println("company_name:" + company_name);
        System.out.println("address:" + address);
        System.out.println("phone:" + phone);
        System.out.println("email:" + email);
    }

    public static String getName() {
        return company_name;
    }

    public static String getAddress() {
        return address;
    }

}
