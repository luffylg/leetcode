import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by hp on 2016/10/12.
 */
public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        int[] ab = new int[26];
        for (int i = 0; i < s.length(); i++) ab[s.charAt(i)-'a']++;
        for (int i = 0; i < t.length(); i++) ab[t.charAt(i)-'a']--;
        for (int val:ab) if (val!=0) return false;
        return true;
    }
}
