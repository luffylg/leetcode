import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by hp on 2016/10/11.
 */
public class FirstUniqueCharacterinaString_387   {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        for (Map.Entry et:map.entrySet()) {
            char key = (char) et.getKey();
            int value = (int) et.getValue();
            if (value==1){
                return s.indexOf(key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FirstUniqueCharacterinaString_387().firstUniqChar("leetleet"));
    }
}
