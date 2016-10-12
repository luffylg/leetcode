import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by hp on 2016/10/11.
 */
public class FirstUniqueCharacterinaString_387   {
    public int firstUniqChar(String s) {
        int[] ar = new int[26];
        int val = s.length() + 1;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (ar[c] == 0) ar[c] = i + 1;
            else ar[c] = val;
        }
        for (int i : ar) {
            if (i > 0 && i < val) val = i;
        }
        return val == s.length() + 1 ? -1 : val-1;
    }

    public static void main(String[] args) {
        System.out.println(new FirstUniqueCharacterinaString_387().firstUniqChar("leetleeta"));
    }
}
