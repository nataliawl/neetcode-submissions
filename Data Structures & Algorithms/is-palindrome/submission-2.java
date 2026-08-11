class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> sCharacters = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sCharacters.add(Character.toLowerCase(c));
            }
        }
        
        int i = 0;
        int j = sCharacters.size() - 1;
        while(i < j){
            if(sCharacters.get(i) != sCharacters.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
