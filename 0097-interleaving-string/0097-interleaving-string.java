class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s3 == "" && s1 == "" && s2 == "")
            return true;
        
        if (s1.length() + s2.length() != s3.length())
            return false;
        int n = s1.length(), m = s2.length();
        int[][] memo = new int[n][m];
        for(int row = 0; row <n; row++)
            for(int col =0; col <m; col++)
                memo[row][col]=-1;
         return dfs(s1, 0, s2, 0, s3, 0, memo);
    }
    private boolean dfs(String s1,int i, String s2,int j, String s3, int k, int[][] memo){
        if (i == s1.length())
            return s2.substring(j).equals(s3.substring(k));
        if (j == s2.length())
            return s1.substring(i).equals(s3.substring(k));
        if (memo[i][j]>-1)
            return (memo[i][j]==1)?true:false;
        boolean ans=false;
        if (s1.charAt(i)==s3.charAt(k) && dfs(s1, i+1, s2, j, s3, k+1, memo) ||
            s2.charAt(j)==s3.charAt(k) && dfs(s1, i, s2, j+1, s3, k+1, memo))
           ans=true;
        memo[i][j]=(ans)?1:0;
        return ans;
    }
}