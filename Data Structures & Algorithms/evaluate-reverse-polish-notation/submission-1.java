class Solution {
    public int evalRPN(String[] tokens) {
        int solution = 0;
        Stack<Integer> stack = new Stack<>();
        
        HashSet<String> operators = new HashSet<>();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
        
        for(String token : tokens){
            if(operators.contains(token) && stack.size() >= 2){
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                int result = 0;
                if(token.equals("+")) result = operand1 + operand2;
                else if(token.equals("-")) result = operand2 - operand1;
                else if(token.equals("*")) result = operand1 * operand2;
                else result = operand2 / operand1;
                stack.push(result);
            }
            else stack.push(Integer.parseInt(token));
        }
        if(stack.size() == 1) solution = stack.pop();

        return solution;
    }
}
