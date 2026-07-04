class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int row = 0; row < matrix.length; row++){
            int left = 0;
            int right = matrix[row].length - 1;
            if (matrix[row][right] < target) continue;
            while(left <= right){
                int mid = left + (right - left) / 2;
                if(matrix[row][mid] == target) return true;
                else if(matrix[row][mid] < target) left = mid + 1;  
                else right = mid - 1;
            }
        }
        return false;
    }
}
