import java.util.HashMap;

public class RomantoInteger_13 {
	public int romanToInt(String s) {
		int sum=0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(){
			{
				put('M',1000);put('D', 500);put('C', 100);put('L', 50);put('X', 10);put('V', 5);put('I', 1);
			}
		};
		int level=1000;
        for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			int currentl=map.get(c);
			if (currentl>level) sum+=(currentl-level*2);
			else sum+=currentl;
			level=currentl;
		}
        return sum;
    }
}
