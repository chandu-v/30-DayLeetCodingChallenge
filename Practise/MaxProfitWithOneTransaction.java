package Practise;

public class MaxProfitWithOneTransaction {

    
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    private static int maxProfit(int[] prices) {
       
       if(prices.length<=1){
        return 0;
       }
       int buy = prices[0];
       int sell = 0;
       int buyIndex;
       int sellIndex;
       int profit = 0;
       int n = prices.length;

       for(int i = 0 ; i < n ; i++ ){
           //maximise profit
           
       }
       return profit;
    }
}