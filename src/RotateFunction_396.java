/**
 * Created by hp on 2016/11/29.
 */
public class RotateFunction_396 {
    public int maxRotateFunction(int[] A) {
        int sum=0,rst=0;
        for (int i = 0; i <A.length ; i++) {
            sum+=A[i];
            rst+=i*A[i];
        }
        int max=rst;
        for (int i = A.length-1; i >0 ; i--) {
            rst=rst+sum-A.length*A[i];
            max=Math.max(max,rst);
        }
        return max;
    }
}
