public class BestTimeToBuyStock_121{
    private int max_profit;
    public int maxProfit(int[] prices){
        if(prices.length == 0)
            return 0;
        int buy_index = 0;
        int sold_index = 0;
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(i < prices.length - 1 && prices[i] < prices[buy_index])
                sold_index = buy_index = i;
            if(prices[i] > prices[sold_index])
                sold_index = i;
            profit = prices[sold_index] - prices[buy_index];
            if(profit > max_profit)
                max_profit = profit;
        }
        return max_profit;
    }

    public static void main(String args[]){
        System.out.println(new BestTimeToBuyStock_121().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new BestTimeToBuyStock_121().maxProfit(new int[]{7, 6, 4, 3, 1, 12}));
        System.out.println(new BestTimeToBuyStock_121().maxProfit(new int[]{2, 4, 1}));
        System.out.println(new BestTimeToBuyStock_121().maxProfit(new int[]{3, 2, 6, 5, 0, 13}));
    }
}
