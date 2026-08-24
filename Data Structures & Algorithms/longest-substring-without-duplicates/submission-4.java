class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        int maxSubLenght = 1;
        char[] charArray = s.toCharArray();

        for(int i = 0; i < charArray.length - 1; i++){
            HashSet<Character> charSet = new HashSet<>();
            charSet.add(charArray[i]);
            int subLenght = 1;
            for(int j = i + 1; j < charArray.length; j++){
                if(charSet.contains(charArray[j])) break;
                charSet.add(charArray[j]);
                subLenght++;
            }
            maxSubLenght = Math.max(subLenght, maxSubLenght);
        }
        return maxSubLenght;
    }
}
