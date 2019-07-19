### LeetCode22题：
[code](/Recursion/GenerateParentheses.py)

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
For example, given n = 3, a solution set is:
```
[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
```
#### 思路：
虽然刷了很多题，但对递归这种思想一直都是懵懵懂懂，跳进去就出不来了，直接看代码似乎很好理解，但是自己很难写出来。大概说一下此题的思路：首先写出跳出条件，
当括号为n对时则跳出，当左括号不到n时，用左括号补充，右括号与左括号不匹配时，用右括号补充。
