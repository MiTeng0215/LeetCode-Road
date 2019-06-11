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
