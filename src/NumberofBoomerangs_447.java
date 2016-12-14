import java.util.HashMap;

/**
 * Created by hp on 2016/12/8.
 */
public class NumberofBoomerangs_447 {
    public int numberOfBoomerangs(int[][] points) {
        if (points.length<3) return 0;
        int count=0;
        for (int i = 0; i <points.length;  i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j <points.length ; j++) {
                if (j==i) continue;
                int length= (int) (Math.pow(points[i][0]-points[j][0],2)+Math.pow(points[i][1]-points[j][1],2));
                if (!map.containsKey(length)) map.put(length,1);
                else {
                    count=count+2*map.get(length);
                    map.put(length,map.get(length)+1);
                }
            }

        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new NumberofBoomerangs_447().numberOfBoomerangs(new int[][]{new int[]{0,0},new int[]{1,0},new int[]{2,0}}));
    }
}
