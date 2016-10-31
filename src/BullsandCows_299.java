import java.util.ArrayList;

public class BullsandCows_299 {
	public String getHint(String secret, String guess) {
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < secret.length(); i++) {
			list.add(secret.charAt(i));
		}
        int A=0;
        for (int i = 0; i < guess.length(); i++) {
			char ch=guess.charAt(i);
			if (ch==secret.charAt(i)) {
				A++;
			}
			if (list.contains(ch)) {
				list.remove((Character)ch);
			}
		}
        int B=guess.length()-list.size()-A;
        String reString=A+"A"+B+"B";
        return reString;
    }

}
