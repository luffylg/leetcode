
public class ValidParentheses_20 {
	public boolean isValid(String s) {
        if (s.length()%2!=0) {
			return false;
		}
        for (int i = 0; i < s.length(); i+=2) {
			char ch=s.charAt(i);
			if (ch=='[') {
				if(s.charAt(i+1)!=']') return false;
			}else if (ch=='{') {
				if(s.charAt(i+1)!='}') return false;
			}else if (ch=='(') {
				if(s.charAt(i+1)!=')') return false;
			}else {
				return false;
			}
		}
        return true;
    }
}
