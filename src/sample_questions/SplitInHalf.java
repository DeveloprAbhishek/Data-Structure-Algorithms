package sample_questions;

import java.util.Scanner;

public class SplitInHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int remaining = k - (a + b);
        if(remaining % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
