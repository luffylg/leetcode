import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by hp on 2016/10/13.
 */
public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
