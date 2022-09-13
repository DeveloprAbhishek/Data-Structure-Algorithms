package sample_questions;

import java.util.Scanner;

public class MotuPatlu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = n % 5;
        int count = n / 5;
        if (count == 0) {
            System.out.println(1);
        } else if (count > 0 && rem == 0) {
            System.out.println(count);
        } else {
            System.out.println((count + 1));
        }
    }
}
