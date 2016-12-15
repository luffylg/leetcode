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
            int distance=0;
            int index = Arrays.binarySearch(heaters, house);
            if (index < 0) {
                index = -index - 1;
                int left = index - 1 < 0 ? Integer.MAX_VALUE : house - heaters[index - 1];
                int right = index > heaters.length - 1 ? Integer.MAX_VALUE : heaters[index] - house;
                distance = Math.min(left, right);
            }
            max = Math.max(max, distance);
        }
        return max;
    }
}
