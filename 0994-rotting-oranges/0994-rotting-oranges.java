class Solution {
    public int orangesRotting(int[][] grid) {
        int freshOranges = 0;
        int m = grid.length;
        int n = grid[0].length;
        int time = 0;
        boolean rotten;

        Queue<Integer> rottenOranges = new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    freshOranges++;
                } else if(grid[i][j]==2){
                    rottenOranges.add(i * n + j);
                }
            }
        }

        while(!rottenOranges.isEmpty() && freshOranges>0){;
            rotten = false;
            int size = rottenOranges.size();
            while(!rottenOranges.isEmpty() && --size>=0){
                int pos = rottenOranges.poll();
                int row = pos / n;
                int col = pos % n;

                if(row>0 && grid[row-1][col]==1){
                    grid[row-1][col] = 2;
                    rotten = true;
                    rottenOranges.add((row-1)*n + col);
                    freshOranges--;
                }

                if(row<m-1 && grid[row+1][col]==1){
                    grid[row+1][col] = 2;
                    rotten = true;
                    rottenOranges.add((row+1)*n + col);
                    freshOranges--;
                }

                if(col>0 && grid[row][col-1]==1){
                    grid[row][col-1] = 2;
                    rotten = true;
                    rottenOranges.add(row*n + col-1);
                    freshOranges--;
                }

                if(col<n-1 && grid[row][col+1]==1){
                    grid[row][col+1] = 2;
                    rotten = true;
                    rottenOranges.add(row*n + col+1);
                    freshOranges--;
                }
            }

            if(rotten){
                time++;
            }
        }
        
        return freshOranges==0 ? time: -1;
    }
}