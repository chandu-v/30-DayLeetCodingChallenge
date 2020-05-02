package Practise;

public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    private static int maxProfit(int[] prices) {
        int stock_included = Integer.MIN_VALUE;
        int stock_excluded = 0;
        for(int i : prices){
            stock_included = Integer.max(stock_included, stock_excluded-i);
            stock_excluded = Integer.max(stock_excluded, stock_included+i);
        }
        return stock_excluded;
    }
}