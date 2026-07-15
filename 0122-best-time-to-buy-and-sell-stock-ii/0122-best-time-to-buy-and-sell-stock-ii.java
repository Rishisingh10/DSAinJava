class Solution {
    public int maxProfit(int[] prices) {

        int currentSum = 0;
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            currentSum += prices[i] - prices[i - 1];

            if (currentSum < 0) {
                currentSum = 0;
            }

            if (currentSum > 0) {
                profit += currentSum;
                currentSum = 0;
            }
        }

        return profit;
    }
}