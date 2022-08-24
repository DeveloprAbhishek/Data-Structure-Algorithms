package sample_questions;

import java.util.Scanner;

public class PatternOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(++count + " ");
            }
            System.out.println();
        }
    }
}
