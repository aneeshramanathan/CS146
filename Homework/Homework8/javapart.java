public int longestPalindrome(String s) {
       if (s == null || s.isEmpty()) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int oddCount = 0;
        for (char c : map.keySet()) {
            int occurences = map.get(c);
            if (occurences % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount == 0) {
            return s.length();
        } else {
            return s.length() - oddCount + 1;
        }
    }
