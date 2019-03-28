# LeetCode-Road
LeetCode's road of mine
## LeetCode107题(二叉树层次遍历)
这是LeetCode的第107道题:
[code107](/LeetCode_Tree/LevelOrderBottom.java)
```
     3
    / \
   9  20
     /  \
    15   7
```
对此类二叉树就行倒序排列,输出3个list
形如:
```
[
  [15,7],
  [9,20],
  [3]
]
```
## LeetCode108题(平衡二叉树)
[code108](/LeetCode_Tree/SortedArrayToBST.java)
```
Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5
 ```
 将有序数组中的数字排列成二叉树的样子.
 
 思路:采取二分法的思想,以中间数组为中心,分别对左子树和右子树进行递归,当递到最底层节点时,return null,最后返回根节点.
 
