### LeetCode118题
[code118](/LeetCode_Array/Pascal'sTriangle.java)

Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

#### Example:

```
Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```
#### 思路:
```
//如题描述,每一个数由上面的两个数作和.
list.add(bigList.get(i-1).get(j-1)+bigList.get(i-1).get(j));
```
### LeetCode119题
这一题与118题类似,但是要求是直接返回输入数字的下一层的list,用上一题的做法可以直接做出,但是时间复杂为O(n^2),接下来的一个解法是O(n)的解法.

源于:[LongsPeak](https://leetcode.com/problems/pascals-triangle-ii/discuss/38420/Here-is-my-brief-O(k)-solution)

```
class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> A(rowIndex+1, 0);
        A[0] = 1;
        for(int i=1; i<rowIndex+1; i++)
            for(int j=i; j>=1; j--)
                A[j] += A[j-1];
        return A;
    }
};
```
### LeetCode121题
[code121](/LeetCode_Array/maxProfit_1.java)

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.
#### Example 1:
```
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
```

此题比较简单,但依然有可以优化的地方,代码中有O(n^2)和O(n)两种解法
### LeetCode122题:
这是我自己的作答:[code122](/LeetCode_Array/maxProfit_02.java)这是运用上一题中的峰谷值做法,针对此题来说较为啰嗦了

跟上一题相比,这题不限制交易次数.底下是时间复杂度为O(n),空间复杂度O(1)的作答

#### 思路:
只要第二天的价格比昨天高,就可以直接交易
```
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
```

