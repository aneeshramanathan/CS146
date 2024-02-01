
class pythonpart:
    def firstBad(n):
        least = 1
        greatest = n
        while least < greatest:
            mid = least + (greatest - least) // 2
            if isBadVersion(mid):
                greatest = mid
            else:
                least = mid + 1
        return least
    
    print(firstBad(4))
    
