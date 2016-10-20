import java.util.ArrayList;

/**
 * Created by hp on 2016/10/20.
 */
public class HouseRobber_198 {
    public int rob(int[] nums) {
        int len=nums.length;
        if (len==0) return 0;
        if (len==1) return nums[0];
        int[] ints = new int[len];
        ints[0]=0;
        ints[1]=nums[0];
        for (int i = 2; i <len; i++) {
            ints[i]=Math.max(ints[i-2]+nums[i-1],ints[i-1]);
        }
        return Math.max(ints[len-2]+nums[len-1],ints[len-1]);
    }
}
