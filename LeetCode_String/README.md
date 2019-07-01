### LeetCode125题:
[code125](/LeetCode_String/isPalindrome.java)

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.
#### Example 1:
```
Input: "A man, a plan, a canal: Panama"
Output: true
```
#### 此题较为简单,代码简单易懂,可见代码注释

### LeetCode168题:
[code168](/LeetCode_String/ExcelSheet.java)

Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:
```
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
```
**思路**
此题相当于一个26进制的题,首先先建立一个空字符串,然后不断取余


### LeetCode5题:

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

**Example 1:**
```
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
```
先前按自己的思路做了一下该题,主要是是通过暴力求解的方式,查找每一个字母是否有对应的回文串,然后找出最长的回文串,这种方式只能解决简单的字符串,当字符过长时,会提示"Time Limit Exceeded",所以此方法不是一个好方法.底下介绍LeetCode推荐的几种解法.

#### Approach 1: Longest Common Substring

**思路:**
反转字符串,找出公共的字符串.然后公共字符串不一定就是回文字符串,例如是S = "abacdfgdcaba", S'= "abacdgfdcaba".公共字符串是:"abacd",显然不是一个正确答案.但也很容易纠正,在查找到一个最长公共子串后,再利用反转看两个字符串是否相等,相等就是最长回文,不等则选择下一个进行判断.

这时就又牵扯到一个最长公共子串的算法,本文选择用字符串矩阵的方式查找公共字符串.
**思路:**

假设:S1 = abcdef S2 = bcde

| |a|b|c|d|e|f|
|-|-|-|-|-|-|-|
|b|0|1|0|0|0|0|
|c|0|0|1|0|0|0|
|d|0|0|0|1|0|0|
|e|0|0|0|0|1|0|

由表格可以看出,最长对角线即为最长公共子串,除了找到最长公共子串外,我们还要记录每一个公共字符串所在的位置,方便做下一步查找,我们可以选择HashMap进行对公共字符串的记录.

```python
import numpy as np

s1 = "babad"
s2 = s1[::-1]
print(s2)
result = np.zeros((len(s1),len(s2)))

for i in range(len(s1)):
    for j in range(len(s2)):
        if(s1[i]==s2[j]):
            if(i == 0 or j == 0):
                result[i][j] = 1
                d.update({str(i)+str(j):1})
            else:
                result[i][j] = result[i-1][j-1] + 1
                d.update({str(i)+str(j):result[i][j]})
print(result)
```
以上代码可以看到公共字符串的情况,再从公共字符串中找出回文串.


#### Dynamic Programming

[code125](/LeetCode_String/longestPalindrome.py)

此代码采取动态规划的方法进行求解,详情可看代码注解

### LeetCode6题
[code006](/LeetCode_String/zigzag.py)

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
```
P   A   H   N
A P L S I I G
Y   I   R
```
And then read line by line: "PAHNAPLSIIGYIR"

简单来说,就是让字符串按给定的行数走S形,然后输出s形字符串

#### 思路:

思路很简单,先建立一个List,然后有几行就创建几个字符串,加入到list中.接着在字符串中的字母按照s形加入到字符串中,设置一个方向变量,当方向走到底时,反向,直至到最后一个字母.

### LeetCood12题:
[code12](/LeetCode_String/IntegertoRoman.py)

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
```
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```
For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

#### Example 1:
```
Input: 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
```
#### 思路:
此题不是很难,因为罗马数字最大只能到3999,把从各位到千位安置好即可,比如个位的8,就是VIII,4和9单独安置.十位如果是8,就是80:LXXX.做一个键值对查询就行了
我的代码很清晰,直接可以看懂.

### LeetCode17题:
[code17](/LeetCode_String/PhoneNumber.py)

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
#### Example:
```
Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
```
#### 思路:
一开始我是以非递归的思想去思考的该题,看了答案才知道用递归的思想,此题代码将变得简洁而优雅.此题就像我们学数学时计算排列组合一样,以树状图的思想层层递归,走到底就返回.代码言简意赅,容易理解.











