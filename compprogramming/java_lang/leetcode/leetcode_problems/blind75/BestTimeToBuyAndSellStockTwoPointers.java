package java_lang.leetcode_problems.blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BestTimeToBuyAndSellStockTwoPointers {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        //we buy the stock on the 'left' day & plan on selling on the 'right' day
//        int left = 0, right = 1;
//        while(right < prices.length){
//            //We want a profitable deal. Hence if the cost at day we buy the stock is less than the price on
//            //the day we sell the stock, calculating currentProfit.
//            //If currentProfit is greater that maxProfit, updating maxProfit
//            if(prices[left]<prices[right]){
//                int currentProfit = prices[right]-prices[left];
//                maxProfit = Math.max(maxProfit, currentProfit);
//            }else{//prices[left]<prices[right]: price of tomorrow is lower than today
//                //if we found a day having even less price , we will buy(examine - pretending to buy) the stock at that day by setting left to that day.
//                left = right;
//            }
//
//            right++;
//        }
//        return maxProfit;

        //right: day sell
        //left: day buy

        int max_profit = 0;
        int left = 0;
        int right = 1;
        while (right < prices.length) {
            if (prices[right] > prices[left]) {//if found better price future
                int profit = prices[right] - prices[left];
                max_profit = Math.max(max_profit, profit);
            }
            else{//if price in future lower, continue
                left++;
            }
            right++;
        }
        return max_profit;
    }


}
