import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by hp on 2016/10/11.
 */
public class FirstUniqueCharacterinaString_387   {
    public int firstUniqChar(String s) {
        int[] ar = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ar[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (ar[s.charAt(i) - 'a']==1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FirstUniqueCharacterinaString_387().firstUniqChar("leetleeta"));
    }
}
