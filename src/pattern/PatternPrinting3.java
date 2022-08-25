package pattern;

import java.util.Scanner;

/*
Pattern you have to print like as shown below.

 * * * * *
 *
 *
 *
 * * * * *
 */

public class PatternPrinting3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == (n - 1)) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < n - 1; j++) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
