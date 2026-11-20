class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        answer = len(nums) != len(set(nums))
        return answer;