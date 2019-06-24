s = "PAYPALISHIRING"
numRows = 3
rows = []

for i in range(min(numRows,len(s))):#添加3个空字符串
    rows.append("")
curRow = 0
goingDown = False

for ch in s:
    rows[curRow] += ch
    if (curRow == 0 or curRow == numRows - 1):
        goingDown = not goingDown  
    curRow =curRow + 1 if goingDown else curRow- 1
news = ''
for i in range(numRows):
    news+= rows[i]
print(news)
