import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by hp on 2016/11/15.
 */
public class ContainsDuplicateII_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k<=0) return false;
        LinkedList<Integer> list = new LinkedList<>();
        for (int num : nums) {
            if (list.size() > k) list.remove(0);
            if (list.contains(num)) return true;
            list.add(num);
        }
        return false;
    }
}
