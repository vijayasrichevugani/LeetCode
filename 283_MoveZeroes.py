class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        left,right=0,0
        while(right < len(nums)):
            if(nums[right] != 0):
                temp = nums[right]
                nums[right] = nums[left]
                nums[left] = temp
                left+=1
            right+=1
