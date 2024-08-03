// set 2 Algo Q1 Buy sell Stock 

class Set2_AlgoQ1{

    public static int maxProfitStock(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
    
            if (price < minPrice) {
                minPrice = price;
            }
        
            int profit = price - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        
        return maxProfit;
    }
    

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfitStock(prices));
    }
 } 

