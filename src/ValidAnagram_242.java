/**
 * Created by hp on 2016/10/12.
 */
public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        int sum = 0;
        for (Character i : s.toCharArray()) sum ^= (int)i;
        for (Character i : t.toCharArray()) sum ^= (int)i;
        return sum == 0;
    }
}
