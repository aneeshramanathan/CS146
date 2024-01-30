from typing import Self


class pythonpart:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        n = len(nums)
        for i in range (0,n-1):
            for j in range (i+1, n):
                if nums[i] + nums[j] == target:
                    return [i, j]
        return []
    
    array = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    arrayTwo = twoSum(Self, array, 17)
    for i in arrayTwo:
        print(i)