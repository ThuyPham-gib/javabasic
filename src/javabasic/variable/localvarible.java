package javabasic.variable;

public class localvarible {
    public void sayHello(){
        int n = 10;
        System.out.println("Gia tri cua n la:" +n);
    }



    public static void main (String[] args){
        localvarible bien = new localvarible();
        bien.sayHello();
    }

}
