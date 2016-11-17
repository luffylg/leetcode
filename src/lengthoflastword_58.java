
public class lengthoflastword_58 {
    public int lengthOfLastWord(String s) {
        int length=0;
		boolean is_previous_blank=true;
        for (int i=s.length()-1;i>=0;i--) {
        	char ch=s.charAt(i);
			if (is_previous_blank) {
				if (ch==' ') {
					continue;
				}
				length++;
				is_previous_blank=false;
			}else {
				if (ch==' ') {
					break;
				}
				length++;
			}
		}
        return length;
    }
}
