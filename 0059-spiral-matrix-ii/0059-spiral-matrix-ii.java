class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int count = 1;
        int left=0,right=n-1,top=0,bottom=n-1;
    
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
               arr[top][i]=count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=count++;
            }
            right--;
            for(int i=right;i>=left;i--){
                arr[bottom][i]=count++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][left]=count++;
            }
            left++;
            
        }
        return arr;
    }
}