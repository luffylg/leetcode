/**
 * Created by hp on 2016/10/23.
 */
public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        int sum=0;
        for (int i:digits) {
            sum*=10;
            System.out.println(sum);
            sum+=i;

        }

        sum+=1;
        int[] rs=new int[String.valueOf(sum).length()];
        for (int i = rs.length-1; i >=0; i--) {
            rs[i]=sum%10;
            sum/=10;
        }
        return rs;
    }

    public static void main(String[] args) {
        int [] out=new PlusOne_66().plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
        for (int i:out) {
            System.out.print(i+" ");
        }
    }
}
