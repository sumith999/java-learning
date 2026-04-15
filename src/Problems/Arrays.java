package Problems;

import java.sql.SQLOutput;

public class Arrays {
    public static void main(String[] args) {
        int[][] arrey = new int[3][];
        arrey[0] = new int[3];
        arrey[1] = new int[4];
        arrey[2] = new int[5];
//        for (int [] n : arrey) {
//            for (int m : n) {
//                System.out.print((int) (Math.random() * 100) + " ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < arrey.length; i++) {
            for (int j = 0; j < arrey[i].length; j++) {
                System.out.print((int) (Math.random() * 100) + " ");
            }
            System.out.println();
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < 4; j++) {
//
//                    System.out.print((int) (Math.random() * 100) + " ");
//                }
//                System.out.println();
        }
    }
}


