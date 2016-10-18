/**
 * Created by hp on 2016/10/18.
 */
public class BestTimetoBuyandSellStock_121 {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for (int price:prices) {
            min=Math.min(min,price);
            max=Math.max(max,price-min);
        }
        return max;
    }
}
