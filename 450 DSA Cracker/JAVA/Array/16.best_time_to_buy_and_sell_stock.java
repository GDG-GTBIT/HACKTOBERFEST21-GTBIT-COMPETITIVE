class Solution {
    public int maxProfit(int[] prices) {
        int x=prices.length;
        int min=prices[0], profit = 0;
        
        for(int i=0;i<x;i++)
        {
            if(min>prices[i])
                min = prices[i];
            
            profit = Math.max(profit, prices[i]-min);
        }
        
        return profit;
    }
}
