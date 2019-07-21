# 假设n=1000，也就是1000个人，m=14，数到13就出列，k=5从第五个人开始报数，算出最后一个出列的人
n = 1000
m = 14
k = 5
class node(object):
    def __init__(self,x):
        self.val = x
        self.next = None
#首先创建1000个节点，然后连起来
head = node(1)
p = head
for i in range(2,n+1):
    a = node(i)
    p.next = a
    p = a
p.next = head#现在构成了一个循环链表
#先走到k节点
p = head
while p.val!=k:
    p = p.next
# 现在p指向k开始循环
num = 1
while p.next != p:
    #每走m步就删除该数
    pre = p
    p = p.next
    num+=1
    if num==m:
        cur = p
        pre.next = p.next
        p = pre.next
        num = 1
print(p.val)
