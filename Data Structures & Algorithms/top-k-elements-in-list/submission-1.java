class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        ArrayList<Integer>[] freqList = new ArrayList[nums.length + 1];
        for (int i = 0; i < freqList.length; i++) {
            freqList[i] = new ArrayList<>();
        }
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            freqList[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int idx = 0;
        for(int i = freqList.length - 1; i > 0 && idx < k; i--){
            for(int num : freqList[i]){
                res[idx++] = num;
                if(idx == k) break;
            }
        }
        return res;
    }
}
