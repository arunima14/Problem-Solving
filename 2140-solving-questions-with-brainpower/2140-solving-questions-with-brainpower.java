class Solution {
    public long mostPoints(int[][] questions) {
       //get the largest element
//         for(int i=0; i<questions.length(); i++){
//             if(maxPoints < questions[i][0]){
//                 maxIndex = i;
//                 maxPoints = questions[i][0];
//             }
//         }
        
//         for(int i=maxIndex; i>=0; i=i-2){
//             points += questions[i][0];
//         }
        
//         for(int i=maxIndex+1; i<questions.length(); i++){
            
//         }
        long[]dp = new long[questions.length];
        return memoization(0, questions, dp);        
    }
    
    private long memoization(int index, int[][] questions, long[]dp){
        if (index >= questions.length){ 
            return 0;
        }
        if (dp[index] > 0){
            return dp[index];
        }
        int points = questions[index][0];
        int jump = questions[index][1];
        long skip = memoization(index + 1, questions, dp);
        long solve = points + memoization(index  + 1 + jump, questions, dp);
        dp[index] = Math.max(skip, solve);
        return dp[index];
    }
}