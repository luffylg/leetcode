/**
 * Created by hp on 2016/10/18.
 */
public class ClimbingStairs_70 {
    public int climbStairs(int n) {
        if (n<=0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        int[] ints = new int[n];
        ints[0]=1;
        ints[1]=2;
        for (int i = 2; i <n ; i++) {
            ints[i]=ints[i-1]+ints[i-2];
        }
        return ints[n-1];
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs_70().climbStairs(20));
    }
}
