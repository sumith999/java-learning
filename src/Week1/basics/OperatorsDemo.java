package Week1.basics;

public class OperatorsDemo {
    public static void main(String[] args) {
        double balance = 10000.0;
        double depositAmount = 5000.0;
        double withdrawAmount = 3000.0;

        // Arithmetic
        double afterDeposit = balance + depositAmount;
        double afterWithdraw = afterDeposit - withdrawAmount;
        System.out.println("After Deposit: " + afterDeposit);
        System.out.println("After Withdraw: " + afterWithdraw);

        // Relational
        System.out.println("Balance > 5000: " + (afterWithdraw > 5000));

        // Logical
        boolean isEligibleForLoan = afterWithdraw > 5000 && afterWithdraw < 100000;
        System.out.println("Loan Eligible: " + isEligibleForLoan);

        // Assignment
        balance += depositAmount;
        System.out.println("Updated Balance: " + balance);
    }
}
