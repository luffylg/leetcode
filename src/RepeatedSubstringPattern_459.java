/**
 * Created by hp on 2016/12/2.
 */
public class RepeatedSubstringPattern_459 {
    public boolean repeatedSubstringPattern(String str) {
        int length=str.length();
        if (length==1) return false;
        for (int i = 1; i <=length/2 ; i++) {
            if (length%i==0){
                if (issame(i,str)) return true;
            }
        }
        return false;
    }

    private boolean issame(int i, String str) {
        String cmp = str.substring(0, i);
        for (int j = 1; j <str.length()/i ; j++) {
            if (!str.substring(j*i,(j+1)*i).equals(cmp)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new RepeatedSubstringPattern_459().repeatedSubstringPattern("abcabc"));
    }
}
