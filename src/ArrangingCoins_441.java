
public class ArrangingCoins_441 {
	public int arrangeCoins(int n) {
		if (n==0) {
			return 0;
		}
		int sum=0;
		int i=1;
		for (; ; i++) {
			sum+=i;
			if (n-sum<i+1) {
				break;
			}
		}
		return i;
    }
}
