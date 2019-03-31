# LeetCode-Road
LeetCode's road of mine
## LeetCode107题(二叉树层次遍历)

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
 ## LeetCode110题(平衡二叉树)
 [code110](/LeetCode_Tree/IsBalanced.java)
 
 判断一个树是不是平衡二叉树(任何节点的左,右子树的高度之差不能超过1)
 
 如图就是一个平衡二叉树:
 
```
    3
   / \
  9  20
    /  \
   15   7
```
 #### 思路:
 
由于递归代码的精简性,我们优先选择用递归的方法去解答此道题.沿着递归的思想,首先我们对根节点作出跳出递归的判断,如果根节点为空,说明此时已到达叶子节点,直接返回True,然后分别计算左右子树的深度,不满足,跳出.满足后再分别对左右子树进行是否平衡的判断.求二叉树的深度依然延续此递归思想.
 ## LeetCode111题(二叉树的深度)
 [code111](/LeetCode_Tree/MinDepth.java)
 
求一个二叉树的最小深度

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],
```
    3
   / \
  9  20
    /  \
   15   7
```
return its minimum depth = 2.

#### 思路
依旧使用递归的思想,如果一个二叉树的左子树或右子树一直为空时,则要对该树一直求深度,因为此树的叶子节点就在最底端.当该二叉树有分叉时,则分别对左右子树求深度,然后选择最小深度.

## LeetCode112题(遍历)


Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

#### Example:

Given the below binary tree and sum = 22,
```
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
```
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

#### 思路
此题有两种解法,都是摘抄自LeetCode中大神对此题提交的答案

#### 第一种:递归(源于:[berkayk](https://leetcode.com/problems/path-sum/discuss/36372/Easy-5-Lines-and-Clean-Java-Solution))
```
 if (root == null)
     return false;
        
  if (root.left == null && root.right == null && root.val == sum) // Leaf check
     return true;
        
  return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
```
#### 第二种:双栈解法(源于:[young_stone](https://leetcode.com/problems/path-sum/discuss/36580/Java-solution-both-recursion-and-iteration))
代码在:[code112]()
