/**
 * Created by hp on 2016/11/4.
 */
public class CountandSay_38 {
    public String countAndSay(int n) {
        if (n==1) return "1";
        StringBuilder sb = new StringBuilder();
        String andSay = countAndSay(n - 1);
        int i=0;
        while (i < andSay.length()){
            char c=andSay.charAt(i);
            int j=i+1;
            while (j < andSay.length()){
                char c2=andSay.charAt(j);
                if (c2!=c) break;
                j++;
            }
            sb.append(j-i);
            sb.append(c);
            i=j;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new CountandSay_38().countAndSay(4));
    }
}
