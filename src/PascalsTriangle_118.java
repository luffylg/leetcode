import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2016/10/23.
 */
public class PascalsTriangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rs=new ArrayList<>();
        for (int i=1;i<=numRows;i++){
            List<Integer> list=new ArrayList<>();
            list.add(1);
            if (i>1){
                for (int j = 2; j <i ; j++) {
                    list.add(rs.get(i-2).get(j-1)+rs.get(i-2).get(j-2));
                }
                list.add(1);
            }
            rs.add(list);
        }
        return rs;
    }
}
