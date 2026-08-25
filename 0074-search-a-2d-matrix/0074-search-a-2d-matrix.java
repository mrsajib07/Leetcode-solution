class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int s=matrix.length;
        int t=matrix[0].length;  
        int low = 0;
        int high = (s * t) -1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row = mid /  t;
            int col = mid %t;
            if (matrix[row][col] == target) {
                return true;
            }
            else if(matrix[row][col] < target) {
                low = mid +1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
        
    }
}