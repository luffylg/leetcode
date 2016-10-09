/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 */
public class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        int j=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for (int i = j; i <nums.length ; i++) {
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{0, 1, 0, 3, 12};
        new MoveZeroes_283().moveZeroes(nums);
        for (int i:nums) {
            System.out.print(i+" ");
        }

    }
}
