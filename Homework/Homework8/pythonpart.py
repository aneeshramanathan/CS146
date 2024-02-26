def longestPalindrome(self, s):
  if s is None:
    return 0
  map = {}
  for i in range(len(s)):
    x = s[i]
    if x in map:
        map[x] += 1
    else:
        map[x] = 1
  count = 0
  for key in map:
    if list(map.keys()).index(key) % 2 == 0:
        count += 1
  if count == 0:
    return len(s)
  else:
    return len(s) - count + 1

