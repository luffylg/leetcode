import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hp on 2016/10/11.
 */
public class RansomNote_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] table=new int[26];
        for (char s:magazine.toCharArray()) {
            table[s-'a']++;
        }
        for (char s:ransomNote.toCharArray()) {
            if(--table[s-'a']<0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new RansomNote_383().canConstruct("",""));
    }
}
