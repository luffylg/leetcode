import java.util.ArrayList;

/**
 * Created by hp on 2016/12/1.
 */
public class IslandPerimeter_463 {
    public int islandPerimeter(int[][] grid) {
        if (grid.length==0) return 0;
        int sum=0;
        int[] lastrow = new int[grid[0].length];
        for (int[] aGrid : grid) {
            int[] thisrow = new int[aGrid.length];
            for (int j = 0; j < aGrid.length; j++) {
                int cell = aGrid[j];
                if (cell == 1) {
                    sum += 4;
                    if (j >= 1 && thisrow[j - 1] == 1) sum -= 2;
                    if (lastrow[j] == 1) sum -= 2;
                    thisrow[j] = 1;
                }
            }
            lastrow = thisrow;
        }
        return sum;
    }
}
