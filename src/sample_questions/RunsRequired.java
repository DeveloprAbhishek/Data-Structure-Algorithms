package sample_questions;

import java.util.Scanner;

public class RunsRequired {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int runsRequired = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();
        int runsRemaining = runsRequired - (n1 + n2 + n3 + n4 + n5 + n6);
        System.out.println(runsRemaining);
    }
}
