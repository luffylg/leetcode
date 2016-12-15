/**
 * Created by hp on 2016/12/15.
 */
public class RangeSumQuery_304 {
    int[] nums;

    public RangeSumQuery_304(int[] nums) {
        for (int i = 1; i <nums.length ; i++) {
            nums[i]+=nums[i-1];
        }
        this.nums = nums;
    }
    public int sumRange(int i, int j) {
        if (i==0) return this.nums[j];
        return this.nums[j]-this.nums[i-1];
    }
}
