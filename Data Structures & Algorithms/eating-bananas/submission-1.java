class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int min = 1;
        int k = max;
        while(min <= max){
            int mid = (min + max) / 2;
            double time = 0;
            for(int pile : piles){
                time += Math.ceil((double)pile/mid);
            }
            if(time <= h){
                k = mid;
                max = mid - 1;
            }
            else min = mid + 1;
        }

        return k;
    }
}
