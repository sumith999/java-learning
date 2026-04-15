
package Problems;
import  java.util.Scanner;

public class rightangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of diamond");
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
// This is the downside of traingle
//        for (int i = num; i>=1; i--){
//            for(int j = 1; j<=i; j++){
//                System.out.print("* ");
//            }
// This is for mirror image
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= num - i; j++) {
//                System.out.print("  " );
//            }
//            for (int j = 1; j <=i; j++){
//                System.out.print("* " );
//            }
            System.out.println();
        }
    }
}