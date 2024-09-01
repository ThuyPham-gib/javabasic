package BAITAP.person;

public class inforclass {
    private static personclass person;

    public static void printPersonInfo(personclass person){
        System.out.println("Name:" + person.getName());
        System.out.println("Age:" + person.getAge());
        System.out.println("Gender:" + person.getGender());
        System.out.println("Address:" + person.getAddress());
        System.out.println("Phone:" + person.getPhone());
    }
}
