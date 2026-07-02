class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])) map.get(nums[i]).add(i);
            else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum == target){
                int res1 = (int) map.get(nums[i]).get(0);
                int res2 = (int) map.get(nums[j]).get(0);
                if(res1 == res2) res2 = (int) map.get(nums[j]).get(1);
                int min = Math.min(res1, res2);
                int max = Math.max(res1, res2);
                return new int[]{min, max};
            }
            else if(sum < target) i++;
            else j--;
        }
        return null;
    }
}