import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by hp on 2016/10/20.
 */
public class ReverseVowelsofaString_345 {
    public String reverseVowels(String s) {
        Stack <Character> sk=new Stack();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c=='a'||c=='o'||c=='e'||c=='i'||c=='u'||c=='A'||c=='O'||c=='E'||c=='I'||c=='U'){
                list.add(i);
                sk.push(c);
            }
        }
        StringBuilder sb = new StringBuilder(s);
        for (int itm:list) {
            sb.replace(itm,itm+1, String.valueOf(sk.pop()));
        }
        return sb.toString();
    }
}
