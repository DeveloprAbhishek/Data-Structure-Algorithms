package sample_questions;

import java.util.Scanner;

public class EnoughFuelConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fuelRequirePerKm = sc.nextInt();
        int totalDistance = sc.nextInt();

        int totalFuelRequires = fuelRequirePerKm * totalDistance;

        if(totalFuelRequires > 50) {
            System.out.println("Enough");
        } else {
            System.out.println("Go On");
        }
    }
}
