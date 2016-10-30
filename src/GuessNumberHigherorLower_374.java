
public class GuessNumberHigherorLower_374 extends GuessGame {
	public int guessNumber(int n) {
		return gs(1,n);
    }
	private int gs(int start,int end){
		int num=(start+end)/2;
		int flag=guess(num);
		if (flag==0) {
			return num;
		}
		if (flag==1) {
			return gs(start,num);
		}
		return gs(num+1,end);
	}
}
