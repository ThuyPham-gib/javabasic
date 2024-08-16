package javabasic.toantu.toantusohoc;

import java.util.concurrent.SynchronousQueue;

public class soHoc {

    public static void main (String[] args){
        int a = 10;
        int b = 20;

        System.out.println("a + b =" + (a + b));
        System.out.println("b % a =" + (b % a));
        System.out.println("a = a + b =" + (a += b)); //a 30
        System.out.println("a = a / b =" + (a / b)); // a = 30/20 or a = 10 if không in System.out.println("a = a + b =" + (a += b)); Nó sẽ lấy kq cuối cùng

    }
}
