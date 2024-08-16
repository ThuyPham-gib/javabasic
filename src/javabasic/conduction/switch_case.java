package javabasic.conduction;

public class switch_case {
    public static void main(String[] args){
    //Sử dụng cho những bài toán có điều kiện đơn giản (1 điều kiện)
        int number = 15;
        String numberString = "muoilam";
        switch (number){
            case 10 :
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break; // để thoát câu lệnh switch, không xét các case tiếp theo nữa
            case 30:
                System.out.println("30");
                break;
            case 15:
                System.out.println("15");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }
    }
}
