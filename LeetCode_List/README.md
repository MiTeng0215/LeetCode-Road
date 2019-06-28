### LeetCode11题
[code](/LeetCode_List/MostWater.py)

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, 
which together with x-axis forms a container, such that the container contains the most water.

#### Example:
```
Input: [1,8,6,2,5,4,8,3,7]
Output: 49
```

#### 思路:

首先我们想到的是用暴击解决该问题,但提交问题的时候,时间超限了.所以我们换一种思路,通过指针的方式,先分别指向两侧,然后谁短就往前走一步,每走一步之前都要先
算好最大值,然后求出最大值.

