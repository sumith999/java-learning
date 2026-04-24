package Week2.exceptions;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        // basic try-catch
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }

        // multiple exceptions
        try {
            int[] arr = new int[5];
            arr[10] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs");
        }

    }
}