/**
 * Created by hp on 2016/12/12.
 */
public class Numberof1Bits_191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum=0;
        while (n!=0){
            sum+=n&1;
            n = n >>> 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Numberof1Bits_191().hammingWeight(-2147483648));
    }
}
