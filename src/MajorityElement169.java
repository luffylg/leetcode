import java.util.HashMap;

/**
 * Created by hp on 2016/10/13.
 */
public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int item:nums) {
            if (map.containsKey(item)){
                map.put(item, map.get(item)+1);
            }else {
                map.put(item, 1);
            }
            if (map.get(item)>nums.length/2) return item;
        }
        return 0;
    }
}
