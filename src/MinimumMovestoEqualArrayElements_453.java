
public class MinimumMovestoEqualArrayElements_453 {
	public int minMoves(int[] nums) {
		int min=Integer.MAX_VALUE;
		int sum=0;
        for (int i = 0; i < nums.length; i++) {
			min=Math.min(min, nums[i]);
			sum+=nums[i];
		}
        return sum-nums.length*min;
    }

}
