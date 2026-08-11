class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> charMap = new HashMap<>();
        charMap.put('(', ')');
        charMap.put('[', ']');
        charMap.put('{', '}');
        
        for(char c : s.toCharArray()){
            if(charMap.containsValue(c)){
                if(stack.isEmpty() || charMap.get(stack.peek()) != c ) return false;
                stack.pop();
            }
            else stack.push(c);
            
        }
        return stack.isEmpty();
    }
}
