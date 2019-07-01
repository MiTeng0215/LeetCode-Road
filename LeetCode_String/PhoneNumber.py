Map = {
    '2':['a','b','c'],
    '3':['d','e','f'],
    '4':['g','h','i'],
    '5':['j','k','l'],
    '6':['m','n','o'],
    '7':['p','q','r','s'],
    '8':['t','u','v'],
    '9':['w','x','y','z']
}
degits = "234"
output = []
def backTrack(com,next_degits):
    if len(next_degits) == 0:
        output.append(com)
    else:
        for letter in Map[next_degits[0]]:
            backTrack(com+letter,next_degits[1:])
backTrack("",degits)
print(output)
