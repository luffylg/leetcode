/**
 * Created by hp on 17-1-11.
 */
public class ConvertaNumbertoHexadecimal_405 {
    public String toHex(int num) {
        if (num<0) return String.format("%7s", toHex2((long) (Math.pow(2, 33) - 1) / 2 + num + 1));
        if (num==0) return "0";
        String[] search=new String[]{"a","b","c","d","e","f"};
        StringBuilder sb = new StringBuilder();
        while (num>0){
            long val=num%16;
            sb.append(String.valueOf(val < 10 ? val : search[(int) (val - 10)]));
            num/=16;
        }
        return sb.reverse().toString();
    }
    public String toHex2(long num) {
        if (num==0) return "0";
        String[] search=new String[]{"a","b","c","d","e","f"};
        StringBuilder sb = new StringBuilder();
        while (num>0){
            long val=num%16;
            sb.append(String.valueOf(val < 10 ? val : search[(int) (val - 10)]));
            num/=16;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new ConvertaNumbertoHexadecimal_405().toHex(-1));
    }
}
