class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> idxStack = new Stack<>();
        int[] result = new int[temperatures.length];
        idxStack.push(0);

        for(int i = 1; i < temperatures.length; i++){
            int currentTemp = temperatures[i];
            while(!idxStack.isEmpty()){
                int top = idxStack.peek();
                int topTemp = temperatures[idxStack.peek()];
                if(topTemp < currentTemp){
                    result[top] = i - top;
                    idxStack.pop();
                }
                else break;
            }
            idxStack.push(i);
    }
        return result;
    }
}
