# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        #设置两个指针,前一个指针是后一个指针的倒数第n个
        p = head
        q = p
        i = 0
        while(i<n):
            p = p.next
            i+=1
        # n!=Node节点数
        if(p!=None):
            while(p.next!=None):
                p,q= p.next,q.next
            q.next = q.next.next
        # n==Node节点数
        else:
            head = q.next
        return head
    
