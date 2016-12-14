import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by hp on 2016/11/15.
 */
public class ContainsDuplicateII_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k<=0) return false;
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++) {
            if (set.size()>k) set.remove(nums[i-k-1]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}
