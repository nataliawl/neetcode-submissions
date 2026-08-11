class Solution {
    public int trap(int[] height) {
        int areaMax = 0;
        int i = 0;
        int j = height.length - 1;
        int leftMax = height[i];
        int rightMax = height[j];
        while (i < j) {
            if(leftMax < rightMax){
                i++;
                leftMax = Math.max(leftMax, height[i]);
                areaMax += leftMax - height[i];
            }
            else {
                j--;
                rightMax = Math.max(rightMax, height[j]);
                areaMax += rightMax - height[j];
            }
            
        }
        return areaMax;
    }
}
