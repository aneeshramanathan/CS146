public int longestPalindrome(String s) {
  if(s == null){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }
            else{
                map.put(x, 1);
            }
        }
        int count = 0;
        for(int i = 0; i < map.size(); i++){
            if(i%2 == 0){
                count++;
            }
        }
        if(count == 0){
            return s.length();
        }
        else{
            return s.length() - count + 1;
        }
    }
