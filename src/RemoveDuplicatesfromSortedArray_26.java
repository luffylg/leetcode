import java.util.HashSet;

/**
 * Created by hp on 2016/10/24.
 */
public class RemoveDuplicatesfromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        int j=1;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]!=nums[i-1]){
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}
