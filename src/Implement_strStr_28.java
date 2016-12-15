
public class Implement_strStr_28 {

	public int strStr(String haystack, String needle) {
		int haylen=haystack.length();
		int neelen=needle.length();
		if (neelen==0) {
			return 0;
		}
		if (haylen<neelen) {
			return -1;
		}
		int i=0;
    	char cmp=needle.charAt(0);
        for (; i <= haylen-neelen; i++) {
			if (cmp==haystack.charAt(i)) {
				if (neelen==1) {
					return i;
				}
				int tmp=i;
				boolean notchanged=true;
				for (int j = 1; j < neelen; j++) {
					if (haystack.charAt(i+j)==cmp&&notchanged) {
						tmp=i+j-1;
						notchanged=false;
					}
					if (haystack.charAt(i+j)!=needle.charAt(j)) {
						break;
					}
					if (j==neelen-1) {
						return i;
					}
				}
				i=tmp;
			}
		}
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(new Implement_strStr_28().strStr("babbbbbabb","bbab"));
	}
}
