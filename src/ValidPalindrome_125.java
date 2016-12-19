/**
 * Created by hp on 2016/12/19.
 */
public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        for (int i = 0,j=s.length()-1; i <s.length()&&j>=0 ; i++,j--) {
            if (j-i<1) break;
            char head=s.charAt(i);
            char tail=s.charAt(j);
            while (!isalphanumeric(head)){
                i++;
                if (i>=s.length()) break;
                head=s.charAt(i);
            }
            while (!isalphanumeric(tail)){
                j--;
                if (j<0) break;
                tail=s.charAt(j);
            }
            if (j-i<1) break;
            if (head!=tail) return false;
        }
        return true;
    }

    private boolean isalphanumeric(char head) {
        return head >= '0' && head <= '9' || head >= 'a' && head <= 'z';
    }
}
