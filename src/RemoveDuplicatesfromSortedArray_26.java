import java.util.HashSet;

/**
 * Created by hp on 2016/10/24.
 */
public class RemoveDuplicatesfromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int j=0;
        for (int i = 0; i <nums.length ; i++) {
            if (!set.contains(nums[i])){
                nums[j++]=nums[i];
                set.add(nums[i]);
            }
        }
        return j;
    }
}
