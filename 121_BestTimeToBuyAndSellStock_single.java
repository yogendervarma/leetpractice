/*
This is a basic version of best time to buy and sell a stock. In this, we'll iterate the array, assuming every day to be lowest price for buy
and updating that with actual lowest value as we iterate. We'll also keep calculating the diff between lowest price and the current price and 
assume it's the max profit, while also calculating and updating max difference as we iterate.

This is a basic Dynamic Programming problem.
*/

class Solution {
    public int maxProfit(int[] prices) {
        
        int lp = Integer.MAX_VALUE;
        int mp = 0;
        int l = prices.length;
        for(int i=0;i<l;i++)
        {
            lp = Math.min(lp,prices[i]);
            mp = Math.max(mp,prices[i]-lp);
        }
        return mp;
    }
}
