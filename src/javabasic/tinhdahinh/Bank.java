package javabasic.tinhdahinh;

public class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class Vietcombank extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class BIDV extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class MB extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

/* Class con Kế thừa từ class Cha
*   Tính chất kế thừa: chỉ gọi variable / constructor từ class cha để sử dụng
*   Tính chất đa hình _Overriding: gọi variable / constructor từ class cha để sử dụng và chỉnh sửa Khác với class
*/

