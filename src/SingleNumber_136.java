import java.util.ArrayList;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i = 0; (i <nums.length); i++) {
            if (list.contains(nums[i])){
                list.remove(new Integer(nums[i]));
            }
            else{
                list.add(nums[i]);
            }

        }
        return list.get(0);
    }

    public static void main(String[] args) {
        System.out.println((new SingleNumber_136()).singleNumber(new int[]{16806,9374,12354,11422,17798,8856,16806,9374,12354,11422,17798,8856,17}));
    }

}
