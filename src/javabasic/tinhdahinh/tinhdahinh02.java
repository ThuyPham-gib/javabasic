package javabasic.tinhdahinh;

public class tinhdahinh02 {
    public static void main(String[] args) {
        Bank b;
        b = new Vietcombank();
        System.out.println("Ví dụ về tính đa hình:");
        System.out.println("Vietcombank Rate of Interest: " + b.getRateOfInterest());
        b = new BIDV();
        System.out.println("BIDV Rate of Interest: " + b.getRateOfInterest());
        b = new MB();
        System.out.println("MB Rate of Interest: " + b.getRateOfInterest());
    }
}
