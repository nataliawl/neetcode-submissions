class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            char[] sChars = s.toCharArray();
            Arrays.sort(sChars);
            String soretedS = new String(sChars);
            map.putIfAbsent(soretedS, new ArrayList<>());
            map.get(soretedS).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}