/**
 * Created by hp on 2016/12/13.
 */
public class ReverseBits_190 {
    public int reverseBits(int n) {
        int result=0;
        int count=32;
        while (count--!=0){
            result=result*2+(n&1);
            n=n>>>1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseBits_190().reverseBits(1));
    }
}
