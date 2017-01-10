/**
 * Created by hp on 17-1-10.
 */
public class NumberComplement_476 {
    public int findComplement(int num) {
        int resulit=0;
        int mi=1;
        while (num>0){
            int bit=1-num%2;
            resulit+=mi*bit;
            num/=2;
            mi*=2;
        }
        return resulit;
    }
}
