package com.ca.mahima.string;

import java.util.Locale;
import java.util.regex.Pattern;

/*Given a string S, the task is to change the complete string to Uppercase or Lowercase depending upon the case for the first character.

Example 1:

Input:
S = "abCD"
Output: abcd
Explanation: The first letter (a) is
lowercase. Hence, the complete string
is made lowercase.
*
* */
public class ChangeTheString {
    public static void main(String[] args) {
        String s = "AbCD";
        String res = "";
        if (Character.isLowerCase(s.charAt(0))) {
            res = s.charAt(0) + s.substring(1, s.length()).toLowerCase();
            System.out.println(res);
        } else {
            res = s.charAt(0) + s.substring(1, s.length()).toUpperCase();
            System.out.println(res);
        }
    }
}
