class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        sumDict = {}

        for i in range(len(nums)):

            sum = target - nums[i]

            if sum in sumDict:
                return [sumDict[sum], i]

            sumDict[nums[i]] = i




        return [-1, -1]