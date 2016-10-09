/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 For example:

 Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */
public class AddDigits_258 {
    public int addDigits(int num) {
        if (num/10==0){
            return num;
        }
        int result=num%10+addDigits(num/10);
        return addDigits(result);
    }

    public static void main(String[] args) {
        System.out.println(new AddDigits_258().addDigits(9773));
    }
}
