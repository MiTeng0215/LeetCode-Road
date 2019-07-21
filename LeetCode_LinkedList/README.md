### LeetCode24题

[code24](/LeetCode_LinkedList/SwapNodes.py)

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
### LeetCode19题:
[code19](/LeetCode_LinkedList/removeNthFromEnd.py)

Given a linked list, remove the n-th node from the end of list and return its head.
#### Example:
```
Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
```
#### 思路:
设置两个指针,前一个指针是后一个指针的倒数n个,这样当前一个指针到达最后的节点时,后一个节点就是倒数第n个,然后把该节点删除即可.这里存才一个一个问题,当
n等于节点个数时,属于另一种情况,单独考虑.代码简洁易懂.

### JosephProblem(约瑟夫环问题）

一个国王要杀害一批死刑犯，但他觉得直接杀掉太没意思，于是他想到一个游戏。他让所有犯人围坐在一起，给每一个犯人进行编号，然后任意指定一个犯人开始报数，
当报到一个特定的数时，就将该犯人杀掉，剩下的人继续围坐在一起，从被杀的犯人的下一个犯人从1开始继续报数，直到只剩下一个人，然后将该犯人释放。
而我们的问题就是找出这个幸运儿的编号
如果有电脑直接编个程序就知道自己死不死了哈哈
下面写两个解法来解决这个问题
#### 数学递推
```
我们先假设，k=3,m=3,n=11
给11个人编号，分别是1-11
当n = 1 时,F(1,3) = 0 真实编号：F+K=3 #F(1,3)+1代表当m=3时，只有一个犯人时幸运儿坐标
当n = 2 时,F(2,3) = 1 真实编号：F+K=4
当n = 3 时,F(3,3) = 1 真实编号：F+K=4
当n = 4 时,F(2,3) = 0 真实编号：F+K=3
当n = 5 时,F(2,3) = 3 真实编号：F+K=6
.
.
.
当n = 11 时,F(11,3) = 6 真实编号：F+K=9
```
这里面涉及到一个问题，当k值较大时，可能会越界，所以最后的结果一般都要对n取余

按照上面的规律，我们总结了一个递推公式

F(n,m)=((F(n-1,m)%n)+k)%N   #这里的N是最大编号N
#### 代码实现
```
def joseph(n,k,m):
    p = 0
    for i in range(2,n+1):
        p = (p+m)%i
        real = (p+k)%n
    return real
```
就是这么简单，就问你怕不怕，接下来讲一个比较传统的方法了，思路和简答，实现起来烦了点。
#### 循环链表
#### 思路：
首先创建n个listnode，首尾连接，制作一个循环链表，将p指向k节点，然后开始往下走，每走m步就将该节点删掉，然后继续循环，直到p的下一个节点还是自己，就跳出循环返回p，具体可以看代码[code](/LeetCode_LinkedList/JosephProblem.py)，有注解。




