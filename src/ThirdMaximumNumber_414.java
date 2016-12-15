
public class ThirdMaximumNumber_414 {
	public int thirdMax(int[] nums) {
		long max=Long.MIN_VALUE;
		long max2=Long.MIN_VALUE;
		long max3=Long.MIN_VALUE;
		for (int i : nums) {
			if (i==max||i==max2) continue;
			if (i>max) {
				max3=max2;
				max2=max;
				max=i;
			}else if (i>max2) {
				max3=max2;
				max2=i;
			}else if (i>max3) {
				max3=i;
			}
		}
		
		return (int) (max3!=Long.MIN_VALUE?max3:max);
    }
	public static void main(String[] args) {
		System.out.println(new ThirdMaximumNumber_414().thirdMax(new int[]{3,2,1}));
	}
}
