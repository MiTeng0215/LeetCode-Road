class Solution {
    public int maxProfit(int[] prices) {
	    int valley = Integer.MAX_VALUE;
	    int profit = 0;
	    int temp = 0;
	    for(int i=0;i<prices.length;i++){
	        //找到了低谷
	        if(prices[i]<valley)
	            valley = prices[i];
	            //找出第一峰值
	            if(prices[i]-valley>temp){
                    //把此次的利润计算出来
	                temp = prices[i]-valley;
                    //如果不再出现新的低谷,那就此次利润加上之前的利润返回
	                if(i==prices.length-1) {
	                	return profit+temp;
	                }
                //出现新的低谷,那就设定低谷,找出下一个峰值
	            }else{
	            	profit +=temp;
	            	temp = 0;
	            	valley = prices[i];
	            }
	        }
		return profit;
    }
}
