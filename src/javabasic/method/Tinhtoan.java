package javabasic.method;

public class Tinhtoan {
// Hàm trả về
    public static int cong2SoNguyen(){
        return 10 + 20;
    }
    // Hàm không trả về
    public static void cong3SoNguyen(){
        System.out.println(10+20+5);
    }

    static void welcome (String name){
        System.out.println("Xin chào" + name);
    }

    public static void main (String[] args){
        System.out.println(cong2SoNguyen() + 20);

        welcome("Tester ");

    }


}
