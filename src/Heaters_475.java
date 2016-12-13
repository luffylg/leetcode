import java.util.Arrays;

/**
 * Created by hp on 2016/12/13.
 */
public class Heaters_475 {
    // 1. find the closest heater of each house and store the distance
    // 2. find the longest distance
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int max=0;
        for (int house:houses) {
            int distance=Integer.MAX_VALUE;
            for (int heater:heaters) {
                if (heater-house>distance) break;
                distance=Math.min(Math.abs(heater-house),distance);
            }
            max=Math.max(distance,max);
        }
        return max;
    }
}
