package main.java.tutorials.masterclass.interfaceExample;

public class Main {
    public static void main(String[] args) {
        iTelephone prkPhone;
        prkPhone = new DeskPhone(123456);

        prkPhone.powerOn();
        prkPhone.callPhone(123456);
        prkPhone.answer();

        prkPhone = new MobilePhone(23456);
        prkPhone.powerOn();
        prkPhone.callPhone(23456);
        prkPhone.answer();
    }
}
