/**
 * Created by hp on 2016/10/11.
 */
public class ExcelSheetColumnNumber_171 {
    public int titleToNumber(String s) {
        int sum=0;
        for (int i = 0; i <s.length() ; i++) {
            int num = s.charAt(i) - 'A' + 1;
            sum=sum*26+num;
        }
        return sum;
    }
}
