/**
 * Created by hp on 2016/11/7.
 */
public class WordPattern_290 {
    public boolean wordPattern(String pattern, String str) {
        String[] split = str.split("\\s");
        if (pattern.length()!=split.length) return false;
        String[] strings = new String[26];
        for (int i = 0; i <strings.length ; i++) {
            strings[i] = "";
        }
        for (int i = 0; i <pattern.length() ; i++) {
            char c=pattern.charAt(i);
            String sr=split[i];
            if (strings[c-'a'].equals("")) strings[c-'a']=sr;
            else if (!strings[c-'a'].equals(sr)) return false;
        }
        return true;
    }
}
