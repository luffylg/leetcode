import java.util.LinkedList;
import java.util.List;

/**
 * Created by hp on 17-1-10.
 */
public class FindAllNumbersDisappearedinanArray_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        LinkedList result = new LinkedList<Integer>();
        for (int i = 0; i <nums.length ; i++) {
            int val=Math.abs(nums[i])-1;
            if (nums[val]>0) nums[val]=-nums[val];
        }
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]>0) result.add(i+1);
        }
        return result;
    }
}
