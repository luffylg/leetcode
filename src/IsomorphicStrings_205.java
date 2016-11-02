import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings_205 {

	public boolean isIsomorphic(String s, String t) {
		if (s.length()!=t.length()) return false;
        HashMap<Character, Character> map=new HashMap<Character,Character>();
        HashSet<Character> set=new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
			char sc=s.charAt(i);
			char tc=t.charAt(i);
			if (!map.containsKey(sc)) {
				if (!set.add(tc)) {
					return false;
				}
				map.put(sc, tc);
			}else {
				if (map.get(sc)!=tc) {
					return false;
				}
			}
		}
        return true;
    }
}
