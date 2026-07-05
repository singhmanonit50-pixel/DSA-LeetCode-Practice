package BuySellStocks;

public class buySellStocks {

    public static int buySellStocks(int[] stocks) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : stocks) {

            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] stocks = {1, 7, 5, 6, 8, 9, 1};

        System.out.println(buySellStocks(stocks));
    }
}
