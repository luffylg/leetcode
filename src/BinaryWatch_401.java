import java.util.LinkedList;
import java.util.List;

/**
 * Created by hp on 17-1-11.
 */
public class BinaryWatch_401 {
    public List<String> readBinaryWatch(int num) {
        LinkedList<String> result = new LinkedList<>();
        for (int i = 0; i <12 ; i++) {
            for (int j = 0; j <60 ; j++) {
                if (bitcount(i)+bitcount(j)==num){
                    String add=String.valueOf(i)+":";
                    if (j<10) add=add+"0";
                    add+=String.valueOf(j);
                    result.add(add);
                }
            }
        }
        return result;
    }

    private int bitcount(int i) {
        String binaryString = Integer.toBinaryString(i);
        int sum=0;
        for (char ch:binaryString.toCharArray()) {
            if (ch=='1') sum+=1;
        }
        return sum;
    }
}
