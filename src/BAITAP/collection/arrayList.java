package BAITAP.collection;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // khởi tạo arraylisst
        ArrayList<Integer> numbers = new ArrayList<>();

        //Tạo vòng lặp For để in ra các  số chẵn từ 0-50
        for (int i =0; i <= 50; i +=2){
            numbers.add(i);
        }
        // Duyệt mảng
        System.out.println("Các số chẵn từ 0-50:");
        for (int number : numbers){
            System.out.println(number);
        }
    }

}
