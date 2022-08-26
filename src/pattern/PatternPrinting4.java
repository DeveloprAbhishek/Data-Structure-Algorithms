package pattern;

import java.util.Scanner;

/*
Pattern you have to print like as shown below.

* * * * *
*       *
*       *
*       *
*       *
 */

public class PatternPrinting4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i>0) {
                for (int j = 0; j < n; j++) {
                    if(j==0 || j==n-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
