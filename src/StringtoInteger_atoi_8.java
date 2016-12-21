/**
 * Created by hp on 2016/12/21.
 */
public class StringtoInteger_atoi_8 {
    public int myAtoi(String str) {
        str=str.trim();
        if (str.equals("")) return 0;
        int pm=1,index=0;
        long total=0;
        if (str.charAt(0)=='+'||str.charAt(0)=='-'){
            pm=str.charAt(0)=='-'?-1:1;
            index++;
        }
        for (; index <str.length() ; index++) {
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;
            total=total*10+(digit);
            if (total*pm>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (total*pm<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int) total*pm;
    }

    public static void main(String[] args) {
        System.out.println(new StringtoInteger_atoi_8().myAtoi("123"));
    }
}
