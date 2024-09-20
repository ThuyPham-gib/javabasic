package javabasic.tinhtruutuong;
// kế thừa từ lớp abstract
abstract class Person
{
    protected String ten;
    protected String cmnd;
    protected String namsinh;

    abstract public void showInfo();
}

// class extends cần phải viết lại đầy đủ các hàm abstract
class SinhVien extends Person
{
    public void showInfo(){

    }
}
