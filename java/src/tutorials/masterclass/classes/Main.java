package tutorials.masterclass.classes;

public class Main {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("suv");
//        System.out.println("Model is " + porsche.getModel());
        Account a1 = new Account(123, 3600, "Kaaviya", "prk@gmail.com",
                "987345981");
        System.out.println("Details of account are :");
        System.out.println(a1.getName());
        System.out.println(a1.getAccNo());
        System.out.println(a1.getBalance());
        System.out.println(a1.getEmail());
        System.out.println(a1.getPhone());
        a1.deposit(1000);
        a1.deposit(56);
        System.out.println("Balance = " + a1.getBalance());
        a1.withdraw(3000);
        a1.withdraw(2000);
        System.out.println("Balance = " + a1.getBalance());
    }
}
