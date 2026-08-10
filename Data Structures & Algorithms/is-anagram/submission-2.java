class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character,Integer> tMap = new HashMap<Character,Integer>();
        for(int i = 0; i < sArr.length; i++){
            sMap.put(sArr[i],sMap.getOrDefault(sArr[i],0)+1);
            tMap.put(tArr[i],tMap.getOrDefault(tArr[i],0)+1);
        }
        return sMap.equals(tMap);
    }
}
