/*
TASK: you are given an integer array "prices", where prices[i] is the price of a given stock on the ith day.
      On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
      However, you can buy it then immediately sell it on the same day.

      Find and return the maximum profit you can achieve.

Approach: "Greedy" algorithm. There is a thing in programming, called "greedy algorithm".
Pseudo-code:
 */

public class BestTimeToBuyAndSell {

    public int maxProfit(int[] prices) {
        double minPrice = Double.POSITIVE_INFINITY;
        double maxProfit = 0.0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                double profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return (int) maxProfit;
    }
}
