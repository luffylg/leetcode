/**
 * Created by hp on 2016/10/11.
 */
public class ExcelSheetColumnTitle_168 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n>0){
            char last = (char) ('A' + (n-1) % 26);
            sb.append(last);
            n=(n-1)/26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnTitle_168().convertToTitle(27));
    }
}
