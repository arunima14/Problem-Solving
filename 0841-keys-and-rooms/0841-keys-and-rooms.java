class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean visited[] = new boolean[n];
        dfs(0, rooms,visited);
        for(int i =0; i<n; i++){
            if(!visited[i]){return false;}
        }
        return true;

    }

    public void dfs(int key, List<List<Integer>> rooms, boolean[] visited){
        visited[key] =true;
        for(int room : rooms.get(key)){
            if(!visited[room]){
                dfs(room,rooms,visited);
            }
        }
    
    }
}