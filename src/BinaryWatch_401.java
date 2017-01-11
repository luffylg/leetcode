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
                if (Integer.bitCount(i)+Integer.bitCount(j)==num){
                    result.add(String.format("%d:%02d",i,j));
                }
            }
        }
        return result;
    }
}
