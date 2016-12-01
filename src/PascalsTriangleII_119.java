import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2016/12/1.
 */
public class PascalsTriangleII_119 {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        if (rowIndex==0) return list;
        List<Integer> row = getRow(rowIndex - 1);
        for (int i = 1; i <rowIndex ; i++) {
            list.add(row.get(i-1)+row.get(i));
        }
        list.add(1);
        return list;
    }
}
