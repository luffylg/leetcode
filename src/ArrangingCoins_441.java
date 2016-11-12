
public class ArrangingCoins_441 {
	public int arrangeCoins(int n) {
		long sum=0;
		int i=1;
		for (; ; i++) {
			sum=i*(i+1)/2;
			if (n<sum) {
				break;
			}
		}
		return i-1;
    }
}
