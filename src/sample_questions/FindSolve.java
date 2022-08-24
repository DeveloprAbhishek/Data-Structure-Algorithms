package sample_questions;

import java.util.Scanner;

public class FindSolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = 2 * x - k;
        int j = 2 * x + 3 * y + 2;
        System.out.println(j);
    }
}
