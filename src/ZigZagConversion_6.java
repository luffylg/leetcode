/**
 * Created by hp on 2016/12/21.
 */
public class ZigZagConversion_6 {
    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i <numRows ; i++) {
            sb[i]=new StringBuilder();
        }
        int i=0;
        while (i<s.length()){
            for (int j = 0; j <numRows&&i<s.length() ; j++,i++) {
                sb[j].append(s.charAt(i));
            }
            for (int j = numRows-2; j >0&&i<s.length() ; j--,i++) {
                sb[j].append(s.charAt(i));
            }
        }
        String result="";
        for (StringBuilder b:sb) {
            result+=b.toString();
        }
        return result;
    }
}
