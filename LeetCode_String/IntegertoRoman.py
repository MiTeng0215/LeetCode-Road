class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        Map = {
                1:'I',
                5:'V',
                10:'X',
                50:'L',
                100:'C',
                500:'D',
                1000:'M'
            }
        s = ""
        i = 0
        while num>0 :
            x = num%10
            # '1*10**i'把键值往前进一位进而去查询十位,百位,千位的键值
            if x==4:
                s = Map[1*10**i]+Map[5*10**i]+s
            if x==9:
                s = Map[1*10**i]+Map[10*10**i]+s
            if x<4:
                s = Map[1*10**i]*x+s
            if x>4 and x<9:
                s = Map[5*10**i]+Map[1*10**i]*(x-5)+s
            num = int(num/10)
            i+=1
        return s
