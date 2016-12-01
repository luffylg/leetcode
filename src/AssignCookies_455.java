import java.util.Arrays;

/**
 * Created by hp on 2016/12/1.
 */
public class AssignCookies_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int start=0;
        int sum=0;
        boolean end=false;
        for (int cookie:g) {
            for (int i = start; i <s.length ; i++) {
                if (cookie<=s[i]){
                    sum+=1;
                    start=i+1;
                    break;
                }else if (i==s.length-1){
                    end=true;
                }
            }
            if (end) break;
        }
        return sum;
    }
}
