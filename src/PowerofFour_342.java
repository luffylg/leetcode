/**
 * Created by hp on 2016/10/19.
 */
public class PowerofFour_342 {
    public boolean isPowerOfFour(int num) {
        if (num==1) return true;
        if (num<=0||num%4!=0) return false;
        return isPowerOfFour(num/4);
    }
}
