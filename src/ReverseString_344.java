/**
 * Created by hp on 2016/10/8.
 */

public class ReverseString_344 {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char a=chars[chars.length-i-1];
            chars[chars.length-i-1]=chars[i];
            chars[i]=a;
        }
//        String reverse="";
//        for (int i=0;i<s.length();i++) {
//            reverse=s.charAt(i)+reverse;
//        }
        return String.valueOf(chars);
    }


    public static void main(String[] args) {
        System.out.println((new ReverseString_344()).reverseString("acs  adffsdd"));
    }
}
