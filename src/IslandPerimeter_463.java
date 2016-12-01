import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by hp on 2016/12/1.
 */
public class IslandPerimeter_463 {
    public int islandPerimeter(int[][] grid) {
        int sum=0;
        HashSet<Integer> lastrow = new HashSet<>();
        for (int[] aGrid : grid) {
            HashSet<Integer> thisrow = new HashSet<>();
            for (int j = 0; j < aGrid.length; j++) {
                int cell = aGrid[j];
                if (cell == 1) {
                    sum += 4;
                    if (thisrow.contains(j-1)) sum -= 2;
                    thisrow.add(j);
                    if (lastrow.contains(j)) sum -= 2;
                }
            }
            lastrow = thisrow;
        }
        return sum;
    }
}
