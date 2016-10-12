import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by hp on 2016/10/12.
 */
public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        for (int i = 0; i <s.length() ; i++) {
            if (sc[i]!=tc[i]) return false;
        }
        return true;
    }
}
