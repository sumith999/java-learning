package Week2.multithreading;

class BankBalance {
    private int balance = 0;

    synchronized void  deposit(int amount) {
        balance += amount;
        System.out.println("The balance is " + balance + " and amount deposited is " + amount);
    }
}
class A implements Runnable{
    BankBalance bank;
    A(BankBalance bank){
        this.bank = bank;
    }
   public void run(){
        bank.deposit(1700);
    }
}
class B implements  Runnable{
    BankBalance bank;
    B(BankBalance bank){
        this.bank = bank;
    }
    public void run(){
        bank.deposit(17000);
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        BankBalance bank = new BankBalance();
        Runnable objA = new A(bank);
        Runnable objB = new B(bank);

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();
        }
    }

