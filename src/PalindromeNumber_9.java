/**
 * Created by hp on 2016/11/15.
 */
public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        if (x==0) return true;
        if (x<0||x%10==0) return false;
        int rev=0;
        while (x>=rev){
            rev=rev*10+x%10;
            if (rev==x) return true;
            x/=10;
            if (rev==x) return true;
        }
        return false;
    }
}
