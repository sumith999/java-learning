package Week1.basics;

class Account {
    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Account acc = new Account(10000);
        acc.deposit(5000);
        acc.withdraw(3000);
        System.out.println("Balance: " + acc.getBalance());
    }
}