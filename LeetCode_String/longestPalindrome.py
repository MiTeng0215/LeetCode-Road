start 
maxLen 
def longestPalindrome(s):
    global start
    global maxLen
    if(len(s) < 2):
        return s
    for i in range(len(s)):
        ```
        如果回文是奇数就是(s,i,i)
        如果回文是偶数就是(s,i,i+1)
        ```
        expandPalindrome(s,i,i);
        expandPalindrome(s,i,i+1);
    return s[start:maxLen]

def expandPalindrome(s,j,k):
    global start
    global maxLen
    #动态规划的思想找出回文数
    while(j>=0 and k< len(s) and s[j]==s[k]):
        j = j-1
        k = k+1
    if(maxLen < k-j-1):
        start = j+1
        maxLen = k-j-1
        
if __name__ == "__main__":
    print(start)
    print(maxLen)
    s = "dbdba"
    sp = longestPalindrome(s)
    print(sp)
