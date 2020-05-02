package Week1;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxProfit {

    public static void main(String[] args) {
        int[] arr = new int[]{7,1,5,3,6,4};
            int maxProfit = getMaxProfit(arr);
        System.out.println(maxProfit);

    }
    
    private static int getMaxProfit(int[] arr){
        int best_without_stock = 0 , best_with_stock = Integer.MIN_VALUE;
        for(int i : arr){
            best_with_stock = Integer.max(best_with_stock, best_without_stock-i);
            best_without_stock = Integer.max(best_without_stock, best_with_stock+i);
        }
        return best_without_stock;
    }

    // private static int getMaxProfit(int[] arr) {
    //     int maxProfit = 0;
    //     int profit = 0;
    //     int tempProfit = 0;
    //     int buy = -1;
    //     int sell = -1;

    //     ArrayList<Integer> buyList = new ArrayList<>();
    //     ArrayList<Integer> sellList = new ArrayList<>();
    //     ArrayList<Integer> profitList = new ArrayList<>();
    //     // Buy stock only if you get profit
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             tempProfit = profitBwtTwoDays(arr, i, j);
    //             if (maxProfit < tempProfit) {
    //                 maxProfit = tempProfit;
    //             }
    //             if (0 < tempProfit) {
    //                 profit = tempProfit;
    //                 buy = i;
    //                 sell = j;
    //                 buyList.add(buy);
    //                 sellList.add(sell);
    //                 profitList.add(profit);
    //                 System.out.println(String.format("%d,%d,%d", buy, sell, profit));
    //             }
    //         }
    //         // System.out.println(String.format("%d,%d,%d,%d", buy,sell,profit,maxProfit));
    //         profit = 0;
    //         buy = -1;
    //         sell = -1;
    //     }
    //     System.out.println(maxProfit);
    //     maxProfit = getTheRightCombination(buyList, sellList, profitList, maxProfit);
    //     return maxProfit;
    // }

    // private static int getTheRightCombination(ArrayList<Integer> buyList, ArrayList<Integer> sellList,
    //         ArrayList<Integer> profitList, int maxProfit) {
    //     int tempProfit[] = new int[profitList.size()];
    //     int buy = -1;
    //     int sell = -1;
    //     for (int i = 0; i < profitList.size(); i++) {
    //         buy = buyList.get(i);
    //         sell = buyList.get(i);

    //         for (int j = i + 1; j < profitList.size(); j++) {
    //             if ((buyList.get(j)) >= (sellList.get(i) + 1)) {
    //                 System.out.println(String.format("%d,%d->%d\t%d,%d->%d\tTotal: %d", buyList.get(i), sellList.get(i),
    //                         profitList.get(i), buyList.get(j), sellList.get(j), profitList.get(j),
    //                         (profitList.get(i) + profitList.get(j))));
    //                 if (maxProfit < (profitList.get(i) + profitList.get(j))) {
    //                     maxProfit = (profitList.get(i) + profitList.get(j));
    //                 }
    //                 for (int k = j + 1; k < profitList.size(); k++) {
    //                     if (buyList.get(k) >= (sellList.get(j) + 1)) {
    //                         System.out.println(String.format("%d,%d->%d\t%d,%d->%d\t%d,%d->%d\tTotal: %d",
    //                                 buyList.get(i), sellList.get(i), profitList.get(i), buyList.get(j), sellList.get(j),
    //                                 profitList.get(j), buyList.get(k), sellList.get(k), profitList.get(k),
    //                                 (profitList.get(i) + profitList.get(j) + profitList.get(k))));
    //                         if ((profitList.get(i) + profitList.get(j) + profitList.get(k)) > maxProfit) {
    //                             maxProfit = (profitList.get(i) + profitList.get(j) + profitList.get(k));
    //                         }
    //                         for (int l = k + 1; l < profitList.size(); l++) {
    //                             if (buyList.get(l) >= (sellList.get(k) + 1)) {
    //                                 System.out.println(String.format(
    //                                         "%d,%d->%d\t%d,%d->%d\t%d,%d->%d\t%d,%d->%d\tTotal:%d", buyList.get(i),
    //                                         sellList.get(i), profitList.get(i), buyList.get(j), sellList.get(j),
    //                                         profitList.get(j), buyList.get(k), sellList.get(k), profitList.get(k),
    //                                         buyList.get(l), sellList.get(l), profitList.get(l), (profitList.get(i)
    //                                                 + profitList.get(j) + profitList.get(k) + profitList.get(l))));
    //                                 if ((profitList.get(i) + profitList.get(j) + profitList.get(k)
    //                                         + profitList.get(l)) > maxProfit) {
    //                                     maxProfit = (profitList.get(i) + profitList.get(j) + profitList.get(k)
    //                                             + profitList.get(l));
    //                                 }
    //                                 for (int m = l + 1; m < profitList.size(); m++) {

    //                                     if (buyList.get(m) >= (sellList.get(l) + 1)) {
    //                                         System.out.println(String.format(
    //                                                 "%d,%d->%d\t%d,%d->%d\t%d,%d->%d\t%d,%d->%d\t%d,%d->%d\tTotal:%d",
    //                                                 buyList.get(i), sellList.get(i), profitList.get(i), buyList.get(j),
    //                                                 sellList.get(j), profitList.get(j), buyList.get(k), sellList.get(k),
    //                                                 profitList.get(k), buyList.get(l), sellList.get(l),
    //                                                 profitList.get(l), buyList.get(m), sellList.get(m),
    //                                                 profitList.get(m),
    //                                                 (profitList.get(i) + profitList.get(j) + profitList.get(k)
    //                                                         + profitList.get(l) + profitList.get(m))));
    //                                         if ((profitList.get(i) + profitList.get(j) + profitList.get(k)
    //                                                 + profitList.get(l) + profitList.get(m)) > maxProfit) {
    //                                             maxProfit = (profitList.get(i) + profitList.get(j) + profitList.get(k)
    //                                                     + profitList.get(l) + profitList.get(m));
    //                                         }
    //                                         for (int n = m + 1; n < profitList.size(); n++) {

    //                                             if (buyList.get(n) >= (sellList.get(m) + 1)) {
    //                                                 System.out.println(String.format(
    //                                                         "%d,%d->%d\t%d,%d->%d\t%d,%d->%d\t%d,%d->%d\t%d,%d->%d\t%d,%d->%d\tTotal:%d",
    //                                                         buyList.get(i), sellList.get(i), profitList.get(i),
    //                                                         buyList.get(j), sellList.get(j), profitList.get(j),
    //                                                         buyList.get(k), sellList.get(k), profitList.get(k),
    //                                                         buyList.get(l), sellList.get(l), profitList.get(l),
    //                                                         buyList.get(m), sellList.get(m), profitList.get(m),
    //                                                         buyList.get(n), sellList.get(n), profitList.get(n),
    //                                                         (profitList.get(i) + profitList.get(j) + profitList.get(k)
    //                                                                 + profitList.get(l) + profitList.get(m)
    //                                                                 + profitList.get(n))));
    //                                                 if ((profitList.get(i) + profitList.get(j) + profitList.get(k)
    //                                                         + profitList.get(l) + profitList.get(m)
    //                                                         + profitList.get(n)) > maxProfit) {
    //                                                     maxProfit = (profitList.get(i) + profitList.get(j)
    //                                                             + profitList.get(k) + profitList.get(l)
    //                                                             + profitList.get(m) + profitList.get(n));
    //                                                 }
    //                                             }
    //                                         }
    //                                     }
    //                                 }
    //                             }
    //                         }

    //                     }
    //                 }

    //             }
    //         }
    //     }
    //     return maxProfit;
    // }

    // private static int profitBwtTwoDays(int[] arr, int i, int j) {
    //     int profit = arr[j] - arr[i];
    //     if (profit > 0) {
    //         return profit;
    //     } else {
    //         return 0;
    //     }
    // }

}