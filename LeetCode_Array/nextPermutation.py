class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        def swap(nums, i, j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp

        def reverse(nums, start):
            i, j = start, len(nums) - 1
            while (i <= (i + j) / 2):
                swap(nums, i, j)
                i += 1
                j -= 1

        i = len(nums)-2
        while(i>=0 and nums[i+1]<=nums[i]):
            i-=1
        if(i>=0):
            j = len(nums) -1
            while(j>=0 and nums[j]<=nums[i]):
                j-=1
            swap(nums,i,j)
        reverse(nums,i+1)
        return nums
