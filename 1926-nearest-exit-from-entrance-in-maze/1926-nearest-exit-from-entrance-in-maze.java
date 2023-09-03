class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> q = new ArrayDeque<int[]>();
        q.add(new int[]{entrance[0],entrance[1]});
        int count=0;

        while(!q.isEmpty()){
            int len = q.size();
            while(len-->0){

                int[] cur = q.poll();
                if(maze[cur[0]][cur[1]] == '+')
                    continue;
                if(isExit(maze,entrance,cur))
                    return count;
                maze[cur[0]][cur[1]] = '+';
                
                int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
                for(int[] arr:dir){
                    // int[] temp = new int[]{ cur[0]+arr[0] , cur[1]+arr[1] };
                    int new_row = cur[0]+arr[0];
                    int new_col = cur[1]+arr[1];

                    if(new_row>=0 && new_col>=0 && new_row<maze.length && new_col<maze[0].length && maze[new_row][new_col]!='+')
                        q.add(new int[]{new_row,new_col});
                }
            }
            count++;
        }
        return -1;
    }

    public boolean isExit(char[][] maze,int[] entrance,int[] cur){

        if( !(cur[0]==entrance[0] && cur[1]==entrance[1] )&& (cur[0]==0|| cur[1] == 0 || cur[0] == maze.length-1 || cur[1] == maze[0].length -1))
            return true;
        return false;
    }
}