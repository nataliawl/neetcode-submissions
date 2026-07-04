class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int k = 0; k < nums.length; k++){
            if(nums[k] > 0) break;
            if(k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1;
            int j = nums.length - 1;
            int target = -nums[k];
            while(i < j){
                if(nums[i] + nums[j] == target){
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], -target)));
                    i++;
                    j--;

                    while(i < j && nums[i] == nums[i - 1] ) i++;
                }
                else if(nums[i] + nums[j] < target) i++;
                else j--;
            }
        }

        return result;
    }
}
