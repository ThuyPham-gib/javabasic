package BAITAP.forloop;

import java.util.ArrayList;

public class arrayJava {
    public static void main(String[] args) {
        int soChan[] = new int[50];
        int index = 0;
        for (int i = 0; i <= 50; i += 2){
            soChan[index] = i;
            index++;
            System.out.print(i + " ");
        }
        System.out.println();
//        for (int number:soChan[index]){
//            System.out.print(number + " ");
//        }
        for (int i = 0; i < soChan.length; i++) {
            System.out.print(soChan[i] + " ");
        }
        System.out.println("\n Tổng vị trí " + soChan.length);
    }
    //Duyệt lần lượt từng phần tử thỏa mãn điều kiện có trong array
    // Sử dụng arraylist để tối ưu code, space
}
