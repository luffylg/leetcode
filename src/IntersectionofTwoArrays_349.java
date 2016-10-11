import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by hp on 2016/10/11.
 */
public class IntersectionofTwoArrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (int i:nums1) list1.add(i);
        for (int i:nums2) list2.add(i);
        while (list1.size()!=0){
            int val=list1.get(0);
            list1.remove((Integer) val);
            if (list2.contains(val)&&!list3.contains(val)){
                list3.add(val);
            }
        }
        return toIntArray(list3);
    }
    private int[] toIntArray(List<Integer> list){
        int[] ret = new int[list.size()];
        for(int i = 0;i < ret.length;i++)
            ret[i] = list.get(i);
        return ret;
    }
}
