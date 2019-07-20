class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        #时间复杂度现在为O(n)
        """
        index = 0
        for num in nums:
            if num==target:
                return index
            else:
                index+=1
        return -1
        """
        #时间复杂度为O（logn）二分法
        low,high = 0,len(nums)-1
        while low<=high:
            mid = (low+high)//2
            if target == nums[mid]:
                return mid
            # 三种判断，分别对应于三种情况
            if nums[0]<=target<nums[mid] or target<nums[mid]<nums[0] or nums[mid]<nums[0]<=target:
                high = mid-1
            else:
                low = mid+1
        return -1
               
        
