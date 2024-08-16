package javabasic.vonglapfor;

public class forcaitien {
    public static void main(String[] args){
        int array[] = {12, 23, 44, 56, 78}; // đây là mảng chứa nhiều gái trị cùng kiểu dữ liệu
        for (int i: array){
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++){
            System.out.println(array[i]);
        }
    }

}
// sự khác nhau giữa 2 vòng lặp: cái dứ cần xđ đc vị trí bắt đầu và vị trí kêt thúc, cái trên không cần