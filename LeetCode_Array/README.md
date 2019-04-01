### LeetCode118题
[code118](/LeetCode_Array/Pascal's Triangle.java)

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
