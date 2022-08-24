package sample_questions;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int area = 3 * R * R;
        System.out.println(area);
    }
}
