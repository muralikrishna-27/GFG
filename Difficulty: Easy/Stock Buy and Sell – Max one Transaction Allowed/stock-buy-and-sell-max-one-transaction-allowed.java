// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else if(prices[i]-minPrice>maxProfit){
                maxProfit = prices[i]-minPrice;
            }
        }
    return maxProfit;  
    }
}