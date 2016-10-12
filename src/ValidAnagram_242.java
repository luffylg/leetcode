import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by hp on 2016/10/12.
 */
public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        char[] chars = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (Character i:chars) {
            list.add(i);
        }
        for (int j=0;j<t.length();j++) {
            char c = t.charAt(j);
            if (list.contains(c)) list.remove((Character) c);
            else return false;
        }
        return true;
    }
}
