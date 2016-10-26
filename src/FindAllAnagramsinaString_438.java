import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2016/10/25.
 */
public class FindAllAnagramsinaString_438 {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int lenp=p.length();
        int lens=s.length();
        if (lenp==0||lens==0||lens<lenp) return list;
        int[] ints = new int[26];
        for (char c:p.toCharArray()) {
            ints[c-'a']++;
        }
        for (int i = 0; i < lenp-1; i++) {
            ints[s.charAt(i)-'a']--;
        }
        for (int i = 0; i <lens-lenp+1 ; i++) {
            ints[s.charAt(i+lenp-1)-'a']--;
            if (iszero(ints)) list.add(i);
            ints[s.charAt(i)-'a']++;
        }
        return list;
    }

    private boolean iszero(int[] ints) {
        for (int item:ints) {
            if (item!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new FindAllAnagramsinaString_438().findAnagrams("cbaebabacd","abc"));
    }

}
