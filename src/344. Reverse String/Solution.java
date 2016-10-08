/**
 * Created by hp on 2016/10/8.
 */

public class Solution {
    public String reverseString(String s) {
        String reverse="";
        for (int i=0;i<s.length();i++) {
            reverse=s.charAt(i)+reverse;
        }
        return reverse;
    }


    public static void main(String[] args) {
        System.out.println((new Solution()).reverseString("acsa111dd"));
    }
}
