class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if(head==None or head.next == None):
            return head
        p1 = guard = ListNode(0)
        guard.next = head
        guard = head.next
        
        while(p1.next and p1.next.next):            
            p0 = p1
            p1 = p0.next
            p2 = p0.next.next
            p0.next = p2
            p1.next = p2.next
            p2.next = p1      
            
        return guard
