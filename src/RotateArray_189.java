/**
 * Created by hp on 2016/12/20.
 */
public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start<end){
            int tmp=nums[start];
            nums[start]=nums[end];
            nums[end]=tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        new  RotateArray_189().rotate(new int[]{1,2},1);
    }
}
