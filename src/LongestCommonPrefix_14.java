/**
 * Created by hp on 2016/11/23.
 */
public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0) return "";
        String result=strs[0];
        for (String s:strs) {
            String tmp="";
            for (int i = 0; i < Math.min(s.length(),result.length()); i++) {
                char common=result.charAt(i);
                char cmp=s.charAt(i);
                if (common==cmp) tmp+=cmp;
                else break;
            }
            result=tmp;
            if (result.equals("")) return "";
        }
        return result;
    }
}
