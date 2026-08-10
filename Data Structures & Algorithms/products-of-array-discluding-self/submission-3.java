class Solution {
    public int[] productExceptSelf(int[] nums) {
         int totalProduct = 1;
        int countZero = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                countZero++;
                continue;
            }
            totalProduct *= nums[i];
        }
        
        if(countZero > 1){
            return new int[nums.length];

        }
        
        int[] results = new int[nums.length];
        if(countZero == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0) results[i] = totalProduct;
            }
        }
        else{
            for(int i = 0; i < nums.length; i++){
                results[i] = totalProduct / nums[i];
            }

        }
        return results;
    }
}  
