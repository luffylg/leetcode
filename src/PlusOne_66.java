/**
 * Created by hp on 2016/10/23.
 */
public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0; i--) {
            if (digits[i]==9){
                digits[i]=0;
            }else {
                digits[i]+=1;
                return digits;
            }
        }
        int[] ints = new int[digits.length + 1];
        ints[0]=1;
        return ints;
    }

    public static void main(String[] args) {
        int [] out=new PlusOne_66().plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
        for (int i:out) {
            System.out.print(i+" ");
        }
    }
}
