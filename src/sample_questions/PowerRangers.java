package sample_questions;

import java.util.Scanner;

public class PowerRangers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int totalPower = ((n1 * 5) + (n2 * 4) + (n3 * 3) + (n4 * 2) + n5);
        System.out.println(totalPower);
    }
}
