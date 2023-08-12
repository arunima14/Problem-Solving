class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
            if (m == 0) return 0;
            int n = obstacleGrid[0].length;
            
            int[][] boup = new int[m+1][n+1];
            boup[m-1][n] = 1;
        
        for(int r = m-1; r >= 0; r--){
            for(int c = n-1; c >= 0; c--){
                if(obstacleGrid[r][c] == 1) boup[r][c] = 0;
                else boup[r][c] = boup[r+1][c] + boup[r][c+1];
            }
        }
        return boup[0][0];
    }
}