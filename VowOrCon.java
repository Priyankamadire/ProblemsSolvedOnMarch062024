
/*
 * Somu is playing a game. The Game Rules are as follows 

A word will be given, where Ramu has to replace the letters of the word with V/C
If the letter is a vowel it will be de denoted by upper case letter ‘V’ and 
if the letter is a consonant it will be denoted by upper case letter ‘C’. 

Note - The output will contain a word containing alternating sequence of ‘C’ and ‘V’.
It is not permissible to have two or more consecutive V or C in Sequence.
Letters will be only(a-z/A-Z)

input = hello 
output = CVCV

Explanation - When we convert the above  "hello" we have CVCCV 
but for the output It is not permissible to have two or more consecutive V or C in Sequence.
so CVCCV changes to CVCV
 */
import java.util.*;

public class VowOrCon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(solve(s));
    }

    public static String solve(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u')) {
                sb.append('V');
            } else {
                sb.append('C');
            }
        }
        String k = removeConse(sb.toString());
        return k;
        // return sb.toString();

    }

    public static String removeConse(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                sb.append(s.charAt(i));
            }
        }
        if (n > 0) {
            sb.append(s.charAt(n-1));
        }
        return sb.toString();
    }
}