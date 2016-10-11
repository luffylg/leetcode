import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hp on 2016/10/11.
 */
public class RansomNote_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] table=new int[26];
        for (int i = 0; i <magazine.length() ; i++) {
            table[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i <ransomNote.length() ; i++) {
            if (--table[ransomNote.charAt(i)-'a']<0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new RansomNote_383().canConstruct("",""));
    }
}
