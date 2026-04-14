package Week1.basics;

public class TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit casting - smaller to larger
        int amount = 5000;
        double transactionAmount = amount;
        System.out.println("Transaction Amount: " + transactionAmount);

        // Explicit casting - larger to smaller
        double accountBalance = 10500.75;
        int roundedBalance = (int) accountBalance;
        System.out.println("Rounded Balance: " + roundedBalance);
    }
}