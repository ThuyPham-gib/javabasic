package javabasic.conduction;

public class conduction_If_elsse_if {
    public static void main(String[] args){
        double DTB = 4.5;

        //Sử dụng khi có từ 2 điều kiện của If trở lên
        if (DTB>= 8){
            System.out.println("Tot");
        } else if (DTB>= 6.5 && DTB < 8) {
            System.out.println("kha");
        } else if (DTB >= 5 && DTB < 6.5) {
            System.out.println("Trung binh");
        }
        else {
            System.out.println("Yeu");
        }

    }
}
