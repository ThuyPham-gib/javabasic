package javabasic.learncollection;


import java.util.*;

public class Vd_collection {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<String>(); // lưu theo thứ tự, không loại bỏ giá trị trùng lặp
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("C++");
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");

        List<String> linkList = new LinkedList<>();// linked => giúp chúng ta lưu trữ kiểu link
        linkList.add("PHP");
        linkList.add("Python");
        System.out.println("Các phan tu cua LinkedList");
        System.out.print("\t" + arrayList+ "\n");

        Set<Integer> integerSet = new HashSet<>(); // ngẫu nhiên, lưu không theo thứ tự
        integerSet.add(12);
        integerSet.add(5);
        integerSet.add(30);
        integerSet.add(20);
        System.out.println("Cac gia tri trong HashSet:" + integerSet);

        Set<Integer> integerTreeSet = new TreeSet<>(); //sắp xếp theo thứ tự, loại bỏ giá trị trùng lặp
        integerTreeSet.add(12);
        integerTreeSet.add(5);
        integerTreeSet.add(30);
        integerTreeSet.add(30);
        integerTreeSet.add(20);
        integerTreeSet.stream().sorted(); // dùng để sắp xếp
        System.out.println("Cac gia tri trong TreeSet:" + integerTreeSet);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("project", "Bank");
        stringMap.put("company","viettel");

        System.out.println(stringMap);
        System.out.println(stringMap.get("company"));


    }

}
