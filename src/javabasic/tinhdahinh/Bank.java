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
