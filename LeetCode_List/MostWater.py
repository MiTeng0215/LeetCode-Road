def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        # Brute Force
        """
        maxWater = 0
        for i in range(len(height)):
            for j in range(i+1,len(height)):
                s = min(height[i],height[j])*(j-i)
                if(s>maxWater):
                    maxWater = s
        return maxWater
        """
        maxWater = 0
        l = 0
        r = len(height)-1
        while(r>l):
            s = (r-l)*min(height[l],height[r])
            if(s>maxWater):
                maxWater = s
            if(height[l]<height[r]):
                l+=1
            else:
                r-=1
        return maxWater
