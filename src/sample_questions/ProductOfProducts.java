package sample_questions;

import java.util.Scanner;

public class ProductOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int product = (k * a) * (k * b) * (k * c);
        System.out.println(product);
    }
}
