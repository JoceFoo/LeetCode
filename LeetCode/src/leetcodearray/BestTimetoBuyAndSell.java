package leetcodearray;

public class BestTimetoBuyAndSell {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int x, y;
        if (prices.length == 0) {
            return 0;
        }
        int z = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[z]) {
                profit += prices[i] - prices[z];
                z++;
            } else {
                z++;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
//        int[] prices = {7, 1, 5, 3, 6, 4};
int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
