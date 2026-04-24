package Week2.exceptions;

public class ThrowThrowsDemo {

    static void validateAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Age is valid: " + age);
    }

    static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        validateAge(23);
        divide(10, 2);
    }
}
