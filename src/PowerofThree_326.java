
public class PowerofThree_326 {
	public boolean isPowerOfThree(int n) {
		while (true) {
			if(n<=0) return false;
			if (n==1) return true;
			if (n%3!=0) return false;
			n=n/3;
		}
    }
}
