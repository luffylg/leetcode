/**
 * Created by hp on 2016/12/1.
 */
public class AddBinary_67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int bonus=0;
        for (int i = 0; i <Math.max(a.length(),b.length()) ; i++) {
            int anum=0,bnum=0;
            if (a.length()-1-i>=0) anum=a.charAt(a.length()-1-i)-'0';
            if (b.length()-1-i>=0) bnum=b.charAt(b.length()-1-i)-'0';
            sb.append(anum^bnum^bonus);
            bonus=(anum+bnum+bonus)/2;
        }
        if (bonus==1) sb.append(bonus);
        return sb.reverse().toString();
    }
}
