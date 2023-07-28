class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int sum = 0;
    for( int n : nums ) sum += n;
    
    Integer[][][] dp = new Integer[nums.length][nums.length][3];
    
    int maxASum = find(0, nums.length-1, 1, nums, dp);
    
    return maxASum >= (sum - maxASum) ;
    
}

private int find( int i, int j, int turn, int[] nums, Integer[][][] dp){
    
    if( i == j ) return turn == 1 ? nums[i] : 0;
    
    if( dp[i][j][turn] != null ) return dp[i][j][turn];
    
    if( turn == 1 ){//p1
        
        return dp[i][j][turn] = Math.max( nums[i] + find(i+1, j, 2, nums, dp), nums[j] + find(i, j-1, 2, nums, dp) );
        
    }else{
        
        return dp[i][j][turn] = Math.min(find(i+1, j, 1, nums, dp),find(i, j-1, 1, nums, dp)) ;                
        
    }
    }
}