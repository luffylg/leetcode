import java.util.ArrayList;

/**
 * Created by hp on 2016/12/15.
 */
public class CountPrimes_204 {
    public int countPrimes(int n) {
        if (n<=2) return 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        for (int num = 3; num <n ; num+=2) {
            if (isPrime(num, list)) list.add(num);
        }
        return list.size();
    }

    private boolean isPrime(int num, ArrayList<Integer> list) {
        double sqrt = Math.sqrt(num);
        for (int cmp:list) {
            if (cmp>sqrt) break;
            if (num%cmp==0) return false;
        }
        return true;
    }
}
