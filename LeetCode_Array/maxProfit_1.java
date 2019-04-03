//O(n^2)
class Solution {
    public int maxProfit(int[] prices) {
        //让后面的数减去前面的数,找出两个数相减值最大
        int max=0;
        for(int i = 0;i<prices.length;i++){
            for(int j = i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>max){
                    max = prices[j]-prices[i];
                }
                
            }
        }
        return max;
    }
}
//O(n)
public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
