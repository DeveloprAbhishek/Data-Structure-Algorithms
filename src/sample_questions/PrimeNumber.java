package sample_questions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int endNum = sc.nextInt();

        for (int i = startNum; i <= endNum; i++) {
            isPrime(i);
        }

    }

    public static void isPrime(int num) {
        if(num>1) {
            int n = num/2;
            for (int i = 2; i <= n; i++) {
                if(num%i==0) {
                    return;
                }
            }
            System.out.print(num + " ");
        }
    }
}
