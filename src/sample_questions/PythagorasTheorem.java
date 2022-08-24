package sample_questions;

import java.util.Scanner;

public class PythagorasTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int perpendicular = sc.nextInt();
        int squareOfHypotenuse = (base * base) + (perpendicular * perpendicular);
        System.out.println(squareOfHypotenuse);
    }
}
