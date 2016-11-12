import java.util.Stack;

public class ValidParentheses_20 {
	public boolean isValid(String s) {
        if (s.length()%2!=0) {
			return false;
		}
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			switch (ch) {
			case ']':
				if (stack.isEmpty()) {
					return false;
				}
				if (stack.pop()!='[') {
					return false;
				}
				break;
			case '}':
				if (stack.isEmpty()) {
					return false;
				}
				if (stack.pop()!='{') {
					return false;
				}
				break;
			case ')':
				if (stack.isEmpty()) {
					return false;
				}
				if (stack.pop()!='(') {
					return false;
				}
				break;

			default:
				stack.push(ch);
			}
		}
        return stack.isEmpty();
    }
}
