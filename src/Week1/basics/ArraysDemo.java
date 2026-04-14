package Week1.basics;

public class ArraysDemo {
    public static void main(String[] args) {
        // Single dimensional - patient ages
        int[] patientAges = {25, 34, 45, 60, 72};
        System.out.println("Total Patients: " + patientAges.length);

        for (int age : patientAges) {
            System.out.println("Age: " + age);
        }

        // Multi dimensional - ward and bed numbers
        int[][] hospitalWards = {
                {101, 102, 103},
                {201, 202, 203},
                {301, 302, 303}
        };

        System.out.println("Ward 2 Bed 1: " + hospitalWards[1][0]);

        for (int i = 0; i < hospitalWards.length; i++) {
            for (int j = 0; j < hospitalWards[i].length; j++) {
                System.out.print(hospitalWards[i][j] + " ");
            }
            System.out.println();
        }
    }
}
