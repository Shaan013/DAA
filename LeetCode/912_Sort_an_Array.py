class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        freq = {}
        start = end = nums[0]

        for num in nums:
            if num in freq:
                freq[num] += 1
            else:
                freq[num] = 1
            if num < start:
                start = num
            if num > end:
                end = num + 1
        
        nums = [x for x in range(start, end+1) if x in freq for repeat in range(freq[x])]
        return nums
        
