import java.util.ArrayList;

/**
 * Created by hp on 2016/12/15.
 */
public class CountPrimes_204 {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count=0;
        for (int i = 2; i * i < n; i++) {
            if (notPrime[i]) continue;
            for (int j = i; j * i < n; j++) {
                notPrime[i * j] = true;
            }
        }
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new CountPrimes_204().countPrimes(499979));
    }
}
