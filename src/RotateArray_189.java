/**
 * Created by hp on 2016/12/20.
 */
public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        int[] ints = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            ints[(i+k)%nums.length]=nums[i];
        }
        nums=ints;
    }

    public static void main(String[] args) {
        new  RotateArray_189().rotate(new int[]{1,2},1);
    }
}
