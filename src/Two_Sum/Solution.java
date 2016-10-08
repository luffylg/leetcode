package Two_Sum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        for (int i:new Solution().twoSum(new int[]{13,0,0,7,1},7)) {
            System.out.println(i);
        }
    }
}
