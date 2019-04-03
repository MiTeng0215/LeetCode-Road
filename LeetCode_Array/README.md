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