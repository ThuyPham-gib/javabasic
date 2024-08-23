package javabasic.learncollection;

import java.util.ArrayList;

public class vd_ArrayList {
    public static void main(String[] args) {
        //Khai báo
        ArrayList<String> arrayList = new ArrayList<>();

        // Thêm phần tử vào  arrayList
        arrayList.add("Selenium");
        arrayList.add("Cypress");
        arrayList.add("Selenium");
        arrayList.add("Selenium");
        arrayList.add("Selenium");
        arrayList.add("Selenium");
        arrayList.add("Selenium");

        // thêm hàm có vị trí
        arrayList.add(1, "Catalon");
        arrayList.add(3, "Student");

        //Cách in nguyên cụm (kiểu dạng danh sách)
        System.out.println(arrayList);

        // Duyệt phần tử trong array: Sử dụng vòng lặp for _ hiển thị các phần tử của list
        for (int i = 0; i < arrayList.size(); i++) { // size: hàm tính độ dài
            // Cách in rời rạc
            System.out.println(arrayList.get(i));
        }

            // khai báo thêm ArrayList thứ 2:
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList2.add("Java");
            arrayList2.add("Python");

            System.out.println("*****************");
            //Add all arraylist 2 to arraylist 1
            arrayList.addAll(arrayList2); // note: nó chạy mãi nếu kh có dòng lặp for
            for (int i = 0; i < arrayList.size(); i++){ // size: hàm tính độ dài
                System.out.println(arrayList.get(i));


        }

            // Remove 1 phần tử trong ARRAYLIST
        arrayList.remove("Selenium");// delete selenium đầu tiên
        arrayList.remove(2);

            // duyệt mảng
        System.out.println("*****************");
        for (int i = 0; i < arrayList.size(); i++){ // size: hàm tính độ dài
            System.out.println(arrayList.get(i));
        }


        // remove có điều kiện
        for (int i = 0; i < arrayList.size(); i++){ // size: hàm tính độ dài
            if (arrayList.get(i).equals("Selenium")){
                arrayList.remove(i);

            }
        }
        System.out.println("*****************");
        for (int i = 0; i < arrayList.size(); i++){ // size: hàm tính độ dài
            System.out.println(arrayList.get(i));
        }
        System.out.println("*****************");
        // tìm kiếm giá trị phần tử
        System.out.println(arrayList.contains("Java")); // trả ra True nếu tìm thất
        System.out.println(arrayList.contains("ABC")); // Trả về false, vì kh tìm thấy
    }
}
