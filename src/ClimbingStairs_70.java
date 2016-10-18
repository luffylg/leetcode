/**
 * Created by hp on 2016/10/18.
 */
public class ClimbingStairs_70 {
    public int climbStairs(int n) {
        if (n<=0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs_70().climbStairs(20));
    }
}
