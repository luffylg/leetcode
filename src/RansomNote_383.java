import java.util.ArrayList;

/**
 * Created by hp on 2016/10/11.
 */
public class RansomNote_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int length1 = ransomNote.length();
        int length2 = magazine.length();
        if (length1>length2){
            return false;
        }
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i <length1 ; i++) {
            list.add(ransomNote.charAt(i));
        }
        for (int i = 0; i <length2 ; i++) {
            if (list.contains(magazine.charAt(i))){
                list.remove((Character) magazine.charAt(i));
            }
        }
        return list.size()==0;
    }

    public static void main(String[] args) {
        System.out.println(new RansomNote_383().canConstruct("",""));
    }
}
