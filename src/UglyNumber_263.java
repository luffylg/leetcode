/**
 * Created by hp on 2016/10/18.
 */
public class UglyNumber_263 {
    public boolean isUgly(int num) {
        if (num<=0) return false;
        if (num == 1) return true;
        if (num % 2 == 0) return isUgly(num / 2);
        if (num % 3 == 0) return isUgly(num / 3);
        return num % 5 == 0 && isUgly(num / 5);
    }
}
