package javabasic.toantu.toantulogic;

public class TTLogic {

    public static void main(String[] args){

    String msg_1= "A";
    String msg_2= "A";
    String msg_3 = "B";

     int num_1 =  10;
     int num_2 = 20;
     int num_3 = 10;


        //&&,||, >,<, ==

        System.out.println(!(msg_1 == msg_2)&&(num_1<=num_2));
        System.out.println(!(msg_1 == msg_2)||(num_1<=num_2));
        System.out.println(num_1 > num_2);
        System.out.println(num_1 < num_2);
        System.out.println(num_1 == num_2);

    }
}
