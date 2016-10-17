import java.util.HashSet;

/**
 * Created by hp on 2016/10/17.
 */
public class HappyNumber_202 {
    public boolean isHappy(int n) {
        if (n<=0) return false;
        HashSet<Integer> set = new HashSet<>();
        while (true){
            if (n==1) return true;
            if (set.contains(n)) return false;
            set.add(n);
            int sum=0;
            while (n>0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            n=sum;
        }
    }
}
