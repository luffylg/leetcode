/**
 * Created by hp on 2016/12/8.
 */
public class NumberofSegmentsinaString_434 {
    public int countSegments(String s) {
        String s1=s.trim();
        if (s1.length()==0) return 0;
        String[] split = s1.split("\\s+");
        return split.length;
    }
}
