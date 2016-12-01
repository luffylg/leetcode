import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2016/12/1.
 */
public class PascalsTriangleII_119 {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <=rowIndex ; i++) {
            list.add(0,1);
            for (int j = 1; j <list.size()-1 ; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }
}
