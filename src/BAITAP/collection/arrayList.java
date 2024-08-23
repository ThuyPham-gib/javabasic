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
            System.out.print(number +" ");
        }
//Thao tác với arraylist
        numbers.remove(10);
        numbers.add(10, 100);
        System.out.println();
        System.out.println("Các số chẵn từ 0-50:");
        for (int number : numbers){
            System.out.print(number +" ");
        }
//        System.out.println("Get index number: " +numbers.get(5));
//        System.out.println("Get index number: " +numbers.get(25));
//        System.out.println("Get index number: " +numbers.indexOf(40));
    }

}
