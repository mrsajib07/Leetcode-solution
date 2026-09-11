class Solution {
    public int minPathSum(int[][] grid) {

        int p=grid.length;
        int s=grid[0].length;

        for(int i=1;i<p;i++){
            grid[i][0]+=grid[i-1][0];
        }
        for(int j=1;j<s;j++){
            grid[0][j] +=grid[0][j-1];
        }
        for(int i=1;i<p;i++){
            for(int j=1;j<s;j++){
                grid[i][j] +=Math.min(grid[i-1][j],grid[i][j-1]);

            }
        }
        return grid[p-1][s-1];
        
    }
}