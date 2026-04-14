package Week1.basics;

public class ControlFlowDemo {
    public static void main(String[] args) {
        int creditScore = 750;

        // if-else
        if (creditScore >= 750) {
            System.out.println("Loan Approved");
        } else if (creditScore >= 600) {
            System.out.println("Loan Under Review");
        } else {
            System.out.println("Loan Rejected");
        }

        // switch
        int appointmentDay = 3;
        switch (appointmentDay) {
            case 1: System.out.println("Monday Appointment"); break;
            case 2: System.out.println("Tuesday Appointment"); break;
            case 3: System.out.println("Wednesday Appointment"); break;
            default: System.out.println("Invalid Day");
        }

        // for loop - print 5 patient IDs
        for (int i = 1; i <= 5; i++) {
            System.out.println("Patient ID: P00" + i);
        }

        // while loop
        int attempts = 0;
        while (attempts < 3) {
            System.out.println("Login attempt: " + (attempts + 1));
            attempts++;
        }
    }
}