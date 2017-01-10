/**
 * Created by hp on 17-1-10.
 */
public class HammingDistance_461 {
    public int hammingDistance(int x, int y) {
        int count=0;
        for (int i = 0; i <32||x!=y ; i++) {
            if (x%2!=y%2) count++;
            x/=2;
            y/=2;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new HammingDistance_461().hammingDistance(1,4));
    }
}
