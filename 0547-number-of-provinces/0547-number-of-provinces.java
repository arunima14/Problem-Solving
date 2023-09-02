class Solution {
    public int findCircleNum(int[][] isConnected) {
        int si = isConnected.length;
       boolean visited [] = new boolean[si];
       int count =0;

       for(int i = 0; i < si; i++){
           if(!visited[i]){
               count++;
               dfs(isConnected, i, visited);
           }
       }
        return count;
    }

    private void dfs(int[][] isConnected, int i, boolean[] visited){
        visited[i] =true;

        for(int neg = 0; neg < isConnected.length; neg++){
            if(!visited[neg] && isConnected[i][neg] ==1){
                dfs(isConnected, neg, visited);
            }
        }
    }
}