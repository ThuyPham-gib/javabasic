package BAITAP.companypackage;


import BAITAP.person.personclass;

public class classCompany {
    private personclass person;

    public  classCompany(personclass person){
        this.person = person;
    }
    public void displayinforclass(){
        System.out.println("Name:" + person.getName());
        System.out.println("Age:" + person.getAge());
        System.out.println("Gender:" + person.getGender());

    }

}
