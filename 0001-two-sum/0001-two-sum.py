class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        
        for i in range(len(nums)):
            
            sum = target - nums[i]
            
            if sum in map:
                return [i, map[sum]]
                
            map[nums[i]] = i
            
        return [-1, -1]

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna