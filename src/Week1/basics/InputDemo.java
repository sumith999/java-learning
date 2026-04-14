package Week1.basics;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Account Balance: ");
        double balance = scanner.nextDouble();

        System.out.println("\n--- Patient Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Balance: " + balance);

        scanner.close();
    }
}
