class Solution {
    public int maxProfit(int[] prices) {
        int profit_price=0;
        int min_buy_price=prices[0];
        for(int i = 0; i <prices.length; i++){
            int current_price = prices[i];
            if(current_price < min_buy_price){
                min_buy_price = current_price;
            }
            else if(current_price - min_buy_price > profit_price){
                profit_price = current_price - min_buy_price  ;
            }
        }
        return profit_price;
    }
}