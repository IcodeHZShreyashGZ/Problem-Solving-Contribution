class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int low = prices[0];
        int max_profit = 0; 
        
        for(int i = 0; i < len; i++){
            if(prices[i] < low){
                low = prices[i]; 
            }
            
            int current_profit = prices[i] - low; 
            
            if(current_profit > max_profit){
                max_profit = current_profit;
            }
        }
        
        return max_profit;
    }
}