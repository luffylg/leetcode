import java.util.ArrayList;

/**
 * Created by hp on 2016/10/20.
 */
public class HouseRobber_198 {
    public int rob(int[] nums) {
        int len=nums.length;
        if (len==0) return 0;
        if (len==1) return nums[0];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(nums[0]);
        for (int i = 2; i <=len; i++) {
            list.add(Math.max(list.get(i-2)+nums[i-1],list.get(i-1)));
        }
        return list.get(len);
    }
}
