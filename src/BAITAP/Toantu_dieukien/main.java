package BAITAP.Toantu_dieukien;

import java.security.PublicKey;

public class main {

    //Biến cố đinh number = 100
    static int num = 100;

    public static void thamSo (int n){
        if (n == num){
            System.out.println("TH1: n == num");
        } else if (n < num) {
            System.out.println("TH2 n < num");
        }else {
            System.out.println("TH3:  n > num");
        }
    }
    public static void main_1(String[] args){
        thamSo(100);
    }
}
