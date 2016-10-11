/**
 * Created by hp on 2016/10/11.
 */
public class AddStrings_415 {
    public String addStrings(String num1, String num2) {
        int carry=0;
        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        StringBuilder sb3 = new StringBuilder();
        sb1.reverse();
        sb2.reverse();
        int length=Math.max(sb1.length(),sb2.length());
        while (sb1.length()<length) sb1.append('0');
        while (sb2.length()<length) sb2.append('0');
        for (int i = 0; i <length ; i++) {
            int rs=(sb1.charAt(i)-'0')+(sb2.charAt(i)-'0')+carry;
            carry=rs/10;
            sb3.append(rs % 10);
        }
        if (carry==1) sb3.append(carry);
        sb3.reverse();
        return sb3.toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddStrings_415().addStrings("89","3397"));
    }
}
