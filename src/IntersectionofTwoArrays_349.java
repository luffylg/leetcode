import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by hp on 2016/10/11.
 */
public class IntersectionofTwoArrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i:nums1) set.add(i);
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (int j:nums2) {
            if (set.contains(j)){
                set.remove(j);
                list3.add(j);
            }
        }
        int[] ret = new int[list3.size()];
        for (int i = 0; i <list3.size() ; i++) {
            ret[i]=list3.get(i);
        }
        return ret;
    }
}
