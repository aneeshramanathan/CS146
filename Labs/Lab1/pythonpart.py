class pythonpart:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        for i in range (n-1):
            for j in range (i+1, n):
                if nums[i] + nums[j] == target:
                    return [i, j]
        return []
    
    def main():
        array = {0,1,2,3,4,5,6,7,8,9}
        arrayTwo = twoSum(array, 17)
        print(arrayTwo)