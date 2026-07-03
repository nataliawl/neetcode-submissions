class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> charList = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)) charList.add(Character.toLowerCase(c));
        }

        int i = 0;
        int j = charList.size() - 1;
        while(i < j){
            if(charList.get(i++) != charList.get(j--)) return false;
            //i++;
            //j--;
        }

        return true;
    }
}
