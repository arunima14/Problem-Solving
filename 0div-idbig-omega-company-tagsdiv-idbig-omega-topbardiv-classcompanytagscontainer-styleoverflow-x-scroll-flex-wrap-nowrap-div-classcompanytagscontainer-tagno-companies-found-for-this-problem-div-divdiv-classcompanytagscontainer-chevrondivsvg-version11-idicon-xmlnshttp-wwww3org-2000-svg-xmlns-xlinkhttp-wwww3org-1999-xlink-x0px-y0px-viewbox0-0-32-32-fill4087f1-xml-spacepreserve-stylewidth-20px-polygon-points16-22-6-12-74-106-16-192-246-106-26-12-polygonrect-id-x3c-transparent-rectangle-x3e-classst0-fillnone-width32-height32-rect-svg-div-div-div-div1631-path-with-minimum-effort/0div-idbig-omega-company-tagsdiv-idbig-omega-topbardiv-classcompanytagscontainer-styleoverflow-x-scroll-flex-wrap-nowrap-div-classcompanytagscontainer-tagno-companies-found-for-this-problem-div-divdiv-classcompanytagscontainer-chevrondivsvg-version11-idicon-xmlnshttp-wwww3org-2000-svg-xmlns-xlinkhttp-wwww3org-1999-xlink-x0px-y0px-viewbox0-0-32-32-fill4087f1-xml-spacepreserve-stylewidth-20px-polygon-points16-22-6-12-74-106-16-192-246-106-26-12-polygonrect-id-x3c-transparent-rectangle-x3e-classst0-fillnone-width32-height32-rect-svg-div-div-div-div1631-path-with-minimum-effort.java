class Solution {
    private int rows, cols;
    public int minimumEffortPath(int[][] heights) {
        rows = heights.length;
        cols = heights[0].length;
        int left = 0;
        int minEffort = Integer.MAX_VALUE;
        int right = 1000001;
        while (left <= right) {
            int possEffort = left + (right - left) / 2;
            if (isValidEffort(possEffort, heights)) {
                minEffort = possEffort;
                right = possEffort - 1;
            } else {
                left = possEffort + 1;
            }
        }
        return minEffort;
    }
    private boolean isValidEffort(int threshold, int [][]heights) {
            boolean[][] visited = new boolean[rows][cols];
            return dfs(0, 0, visited, threshold, heights);
    }
    private int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean dfs(int r, int c, boolean[][] visited, int threshold, int heights[][]) {
            if (r == rows-1 && c == cols-1) {
                return true;
            }
            visited[r][c] = true;
            for (var dir : dirs) {
                int newRow = r + dir[0];
                int newCol = c + dir[1];
                if (isValidCord(newRow, newCol, visited)) {
                   if (Math.abs(heights[newRow][newCol] - heights[r][c]) <= threshold && dfs(newRow, newCol, visited, threshold, heights)) {
                        return true;
                   }                
                }
                
            }
            return false;
        }
        private boolean isValidCord(int r, int c, boolean [][]visited){
            return r >= 0 && r < rows && c >= 0 && c < cols && !visited[r][c];
        
    }
}