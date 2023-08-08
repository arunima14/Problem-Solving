class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealths = new int[accounts.length];
        
        for(int i=0; i<accounts.length; i++){
            addWealths(accounts[i], wealths, i);
        }
        
        int richest = wealths[0];
        for(int i=1; i<wealths.length; i++){
            richest = (int)Math.max(richest, wealths[i]);
        }
        
        return richest;
    }
    
    public void addWealths(int[] arr, int[] wealths, int i){
        int sum = 0;
        for(int j=0; j<arr.length; j++){
            sum += arr[j];
        }
        
        wealths[i] = sum;
    }
    
}