/**
 * Created by hp on 2016/11/23.
 */
public class NthDigit_400 {
    public int findNthDigit(int n) {
        long count=9;
        int start=1;
        int len=1;
        while (n>count*len){
            n-=count*len;
            start*=10;
            count*=10;
            len+=1;
        }
        start+=(n-1)/len;
        String s=String.valueOf(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }
}
