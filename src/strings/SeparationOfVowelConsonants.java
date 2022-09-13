package strings;

import java.util.Scanner;

public class SeparationOfVowelConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0) {
            int n = sc.nextInt();
            String str = sc.next();
            String cons = "";
            String vowel = "";

            for (int i = 0; i < n; i++) {
                char ch = str.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel = vowel + ch;
                } else {
                    cons = cons + ch;
                }
            }

            System.out.println(vowel + cons);
            t--;
        }
    }
}
