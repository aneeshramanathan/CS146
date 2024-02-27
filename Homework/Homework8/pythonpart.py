def longestPalindrome(self, s):
    if len(s) == 0:
        return 0
    map = {}
    for i in range(len(s)):
        c = s[i]
        map[c] = map.get(c, 0) + 1
    oddCount = 0
    for c in map:
        occurrences = map[c]
        if occurrences % 2 != 0:
            oddCount += 1
    if oddCount == 0:
        return len(s)
    else:
        return len(s) - oddCount + 1

