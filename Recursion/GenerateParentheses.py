class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        如果用递归，该怎么求
        """
        ans = []
        def backtrack(S = '',left=0,right=0):
            if len(S) == 2*n:#跳出条件：当括号的数目正好是n对时，则跳出
                ans.append(S)#跳出前将该种括号加入到总list中
                return
            if left < n:#如果左边不够n个，
                backtrack(S+'(',left+1,right)
            if right<left:
                backtrack(S+')',left,right+1)
        backtrack()
        return ans
