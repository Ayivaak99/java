package main.tutorials.masterclass.classes;

public class Account {
    int accNo;
    float balance;
    String name, email, phone;

    public Account(int accNo, float balance, String name, String email,
                   String phone) {
        this.accNo = accNo;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(float money) {
        this.balance += money;
        System.out.println("INR " + money + " deposited in your account.");
    }

    public void withdraw(float money) {
        if (this.balance - money > 0) {
            this.balance -= money;
            System.out.println("INR " + money + " withdrawn from your account.");
        }
        else {
            System.out.println("Insufficient funds to Withdraw!");
        }
    }
}
