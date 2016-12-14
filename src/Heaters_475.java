import java.util.Arrays;

/**
 * Created by hp on 2016/12/13.
 */
public class Heaters_475 {
    // 1. find the closest heater of each house and store the distance
    // 2. find the longest distance
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        Arrays.sort(houses);
        int start=0;
        int max=0;
        for (int house:houses) {
            int distance=Integer.MAX_VALUE;
            for (int i = start; i <heaters.length ; i++) {
                if (heaters[i]-house>distance) break;
                distance=Math.min(Math.abs(heaters[i]-house),distance);
                start=i;
            }
            max=Math.max(distance,max);
        }
        return max;
    }
}
