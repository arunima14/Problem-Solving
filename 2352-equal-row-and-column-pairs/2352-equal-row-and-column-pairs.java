class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        
        if(n==1)
            return 1;
        
        int[][] transpose = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                transpose[i][j] = grid[j][i];
            }
        } 
        
        int pairs = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(Arrays.equals(grid[i], transpose[j]))
                pairs++;
            }
        }
        
        return pairs;
    }
}