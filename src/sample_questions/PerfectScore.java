package sample_questions;

import java.util.Scanner;

public class PerfectScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int missMarks = 450 - (maths + physics + chemistry);
        System.out.println(missMarks);
    }
}
