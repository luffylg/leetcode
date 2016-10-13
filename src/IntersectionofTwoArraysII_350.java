import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2016/10/13.
 */
public class IntersectionofTwoArraysII_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i:nums1) {
            list1.add(i);
        }
        for (int i:nums2) {
            list2.add(i);
        }
        System.out.println(list2);
        for (int item:list1) {
            if (list2.contains(item)){
                list2.remove((Integer) item);
                list3.add(item);
            }
        }
        int[] ret=new int[list3.size()];
        for (int i = 0; i <list3.size() ; i++) {

            ret[i]=list3.get(i);
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new IntersectionofTwoArraysII_350().intersect(new int[]{1,2,2,1},new int[]{2}));
    }
}
