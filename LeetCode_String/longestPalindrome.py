start 
maxLen 
def longestPalindrome(s):
    global start
    global maxLen
    if(len(s) < 2):
        return s
    for i in range(len(s)):
        expandPalindrome(s,i,i);
        expandPalindrome(s,i,i+1);
    return s[start:maxLen]

def expandPalindrome(s,j,k):
    global start
    global maxLen
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
