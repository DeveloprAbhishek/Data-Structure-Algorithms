package strings;
/*
Check if string is equal that of reverse string
For ex:- naman = naman
 */

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(check("ab"));
    }

    public static boolean check(String str) {
        for (int i = 0, j=str.length()-1; i <= j; i++, j--) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
