package arrays;

/*
You are given an array A of size N. Your task is to modify the array, such that all the zeroes are pushed to the end.
The relative order of all the other elements should remain the same.
Sample Input
2
5
0 1 2 3 0
5
0 0 1 2 3
 */

import java.util.Scanner;

public class PushZeroesEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            int swapIndex = 0;

            for (int i = 0; i < n; i++) {
                if(arr[i] == 0) {
                    count++;
                } else {
                    arr[swapIndex] = arr[i];
                    swapIndex++;
                }
            }

            if(count != 0) {
                for (int i = n-count; i < n; i++) {
                    arr[i] = 0;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}
