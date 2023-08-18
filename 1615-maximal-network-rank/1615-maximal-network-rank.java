class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[][] adj = new int[n][n];
        int[] degree = new int[n];
        for(int i = 0; i<roads.length; i++){
            int u = roads[i][0];
            int v = roads[i][1];

            adj[u][v] = 1;
            adj[v][u] = 1;

            degree[u]++;
            degree[v]++;
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = degree[i] + degree[j];
                if(adj[i][j] == 1 || adj[j][i] == 1){
                    temp-=1;
                }

                ans = Math.max(ans, temp);
            }
        }

        return ans;
    }
}