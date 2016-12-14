/**
 * Created by hp on 2016/12/8.
 */
public class NumberofSegmentsinaString_434 {
    public int countSegments(String s) {
        boolean previousblank=true;
        int count=0;
        for (char ch:s.toCharArray()) {
            if (ch!=' '){
                if (previousblank) count+=1;
                previousblank=false;
            }else previousblank=true;
        }
        return count;
    }
}
