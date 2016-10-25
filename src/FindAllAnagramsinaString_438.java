import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2016/10/25.
 */
public class FindAllAnagramsinaString_438 {
    public List<Integer> findAnagrams(String s, String p) {
        int len=p.length();
        if (len==1){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i <s.length() ; i++) {
                char a=p.charAt(0);
                if (s.charAt(i)==a) list.add(i);
            }
            return list;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <s.length()-len+1 ; i++) {
            ArrayList<Character> list1 = new ArrayList<>();
            for (int j = 0; j < len; j++) {
                list1.add(s.charAt(i+j));
            }
            if (eq(list1,p)) list.add(i);
        }
        return list;
    }

    private boolean eq(ArrayList<Character> list1, String p) {
        for (int i = 0; i <p.length() ; i++) {
            char c = p.charAt(i);
            if (list1.contains(c)) list1.remove((Character)c);
            else return false;
        }
        return true;
    }

}
