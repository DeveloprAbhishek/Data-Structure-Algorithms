package sample_questions;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int B = sc.nextInt();
        int perimeter = 2 * (L + B);
        System.out.println(perimeter);
    }
}
