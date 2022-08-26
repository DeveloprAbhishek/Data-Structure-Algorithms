package sample_questions;

import java.util.Scanner;

public class MotuPatlu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int rem = n;
        while (rem != 0) {
            rem = n%5;
            if(rem == 0) {
                System.out.println(++count);
                break;
            } else {
                n /= 5;
                count++;
            }
        }

    }
}
