
/*
TASK: an alphanumeric ordering of strings is defined as follows:
each string is considered as a "sequence of tokens", where each token is a letter or a number (!)
(as opposed to an isolated digit, as is the case in lexicographic ordering).

For example, the tokens of the string "ab01c004" are (a, b, 01, c, 004]. In order to compare two strings,
we'll first break them down into tokens and then compare the corresponding pairs of tokens with each other
(i.e. compare the first token of the first string with the first token of the second string, etc.).

Here is how tokens are compared:
- if a letter is compared with another letter, the usual alphabetical order applies;
- a number is always considered less than a letter;
- when two numbers are compared, their values are compared and leading zeros, if any, are ignored;
- if at some point one string has no more tokens left while the other one still does, the one with fewer tokens is considered smaller;
- if the two strings s1 and s2 appear to be equal, consider the smallest index i such that tokens (a1)[i] and tokens (a2)[i]
  (where tokens (a1)[i] is the i token of string s) differ only by the number of leading zeros.
  If no such "i" exists, the strings are indeed equal. Otherwise, the string whose i token has more leading zeros is considered smaller.

Here are some examples of comparing strings using alphanumeric ordering.
1) "a" < "a1" < "ab"
2) "ab42" < "ab000144" < "ab00144" < "ab144" < "ab000144x"
3) "x11y012" < "x011y13"

Your task is to return true if s1 is strictly less than s2, and false otherwise.

Example:
1) For s1 = "a" and s2 = "a1, the output should be solution(s1, s2) = true;
These strings have equal first tokens, but since s1 has fewer tokens than =2, it's considered smaller.
2) For s1 = "ab" and s2 = "a1", the output should be solution(s1, s2) = false;
These strings also have equal first tokens, but since numbers are considered less than letters, s1 is larger.
3) For s1 = "b" and s2 = "a1", the output should be solution(s1, s2) = false;
Since b is greater than a s1 Is larger.

Input/Output:
[execution time limit]  3 seconds (java)
[memory limit]          1 GB
[input]                 string s1

A string consisting of English letters and digits.
Guaranteed constraints:
1 <= s1.length <= 20
[input] string s2

A string consisting of English letters and digits.
Guaranteed constraints:
1 <= s2.length <= 20
[output] boolean

true if s1 is alphanumerically strictly less than s2, false otherwise.
 */
public class SequenceOfTokens {
    public static void main(String[] args) {
        boolean b = solution("ab000144", "ab00144");
        String s = Boolean.toString(b);
        System.out.printf(s);
    }
    public static boolean solution(String s1, String s2) {
        int i = 0, j = 0;
        int n1 = s1.length(), n2 = s2.length();
        while (i < n1 || j < n2) {
            int num1 = 0, num2 = 0;
            boolean isNum1 = false, isNum2 = false;
            int leadingZeros1 = 0, leadingZeros2 = 0;
            // Handle numbers in s1
            while (i < n1 && Character.isDigit(s1.charAt(i))) {
                if (s1.charAt(i) == '0' && num1 == 0) {
                    leadingZeros1++;
                }
                num1 = num1 * 10 + (s1.charAt(i) - '0');
                isNum1 = true;
                i++;
            }
            // Handle numbers in s2
            while (j < n2 && Character.isDigit(s2.charAt(j))) {
                if (s2.charAt(j) == '0' && num2 == 0) {
                    leadingZeros2++;
                }
                num2 = num2 * 10 + (s2.charAt(j) - '0');
                isNum2 = true;
                j++;
            }
            if (isNum1 && isNum2) {
                if (num1 != num2) {
                    return num1 < num2;
                } else if (leadingZeros1 != leadingZeros2) {
                    return leadingZeros1 > leadingZeros2;
                }
            } else {
                if (i < n1 && j < n2) {
                    if (s1.charAt(i) != s2.charAt(j)) {
                        return s1.charAt(i) < s2.charAt(j);
                    }
                } else {
                    return i >= n1;
                }
            }
            i++;
            j++;
        }
        return false;
    }
}
