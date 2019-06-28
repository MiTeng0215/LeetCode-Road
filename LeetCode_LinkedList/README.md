### LeetCode24题

[code24](/LeetCode-Road/LeetCode_LinkedList/SwapNodes.py)
Given a linked list, swap every two adjacent nodes and return its head.
You may not modify the values in the list's nodes, only nodes itself may be changed.
```
Given 1->2->3->4, you should return the list as 2->1->4->3.
```
#### 思路

对于学习过数据结构并且熟悉链表的同学来说,此题非常简单.无非就是交换两个节点但不影响其他节点,然后依次往后顺延.关键点在于当你交换完两个节点后,
顺延到下面节点时,能跟前面的节点一样执行交换,以此达到在一个循环中解决问题.

想交换两个节点,需要三个节点的指针,分别指向前一个节点和当前两个节点,因为必须保证我们知道我们前后的位置信息.然后通过如下的简短代码就行交换,依次遍历剩下
节点即可.
```
p0.next = p2
p1.next = p2.next
p2.next = p1
```

