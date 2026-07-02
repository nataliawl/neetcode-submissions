class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<List<Integer>> freq = new ArrayList<>(nums.length + 1);

        for(int i = 0; i <= nums.length; i++){
            freq.add(new ArrayList<>());
        }

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            freq.get(entry.getValue()).add(entry.getKey());
        }

        int[] results = new int[k];
        int index = 0;
        for (int i = freq.size() - 1; i > 0 && index < k; i--) {
            for (int n : freq.get(i)) {
                results[index++] = n;
                if (index == k) {
                    return results;
                }
            }
        }
        return results;

    }
}