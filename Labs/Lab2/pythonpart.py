import string


class pythonpart:
    def validAnagram(s: string, t: string) -> bool:
        if len(s) != len(t):
            return False
        array = sorted(s)
        arrayTwo = sorted(t)
        for i in range(len(s)):
            if array[i] != arrayTwo[i]:
                return False
        return True
    
    print(validAnagram("tea", "eat"))

