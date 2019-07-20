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

### LeetCode36题：
[code](/LeetCode_List/Sudoku.py)

Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
#### Example 1:
```
Input:
[
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
```
#### 思路：
我唯一想到的方法就是暴力求解方法，但代码长度过长且不优雅，但是有位大佬提供了一个很优雅的暴力求解法，直接看代码即可，简单易懂。

### LeetCode33题：
(code)[/LeetCode_List/RotatedArray.py]

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).
#### Example 1:
```
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
```
#### 思路：
该题思路其实很简单，但题目中有一个要求就是，时间复杂度要是log（n），所以此题的难度稍微增加一点点，但通过二分法可直接解决此题，只需找到三个边界条件即可。
