import java.util.*;

/**
 * Created by hp on 2016/10/13.
 */
public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums) {
            set.add(num);
        }
        return nums.length!=set.size();
    }
}
