class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = prices.length - 1; i >= 1; i--){
            int idxProfit = 0;
            for(int j = 0; j < i; j++){
                int profit = prices[i] - prices[j];
                idxProfit = Math.max(idxProfit, profit);
            }
            maxProfit = Math.max(idxProfit, maxProfit);
        }
        
        return maxProfit;
    }
}
