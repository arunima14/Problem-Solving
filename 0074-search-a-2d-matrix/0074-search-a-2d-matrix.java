class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 1)
            return binarySearch(matrix, 0, 0, matrix[0].length-1, target);
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        
        int midCol = matrix[0].length / 2;
        
        while(rowStart <= rowEnd){
            if(rowStart == rowEnd){
                // have only one row
                return binarySearch(matrix, rowStart, 0, matrix[rowStart].length-1, target);
            }
            
            int midRow = rowStart + (rowEnd - rowStart)/2;
            
            if(matrix[midRow][midCol] == target)
                return true;
            
            else if(matrix[midRow][midCol] > target){
                if(matrix[midRow][0] > target)
                    rowEnd = midRow-1;
                else
                    return binarySearch(matrix, midRow, 0, midCol, target);
            }else{
                if(matrix[midRow][matrix[midRow].length-1] < target)
                    rowStart = midRow+1;
                else
                    return binarySearch(matrix, midRow, midCol, matrix[rowStart].length-1, target);
            }
        }
        
        
        return false;
    }
    
    public boolean binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        int start = colStart;
        int end = colEnd;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(matrix[row][mid] == target)
                return true;
            else if(matrix[row][mid] > target)
                end = mid-1;
            else
                start = mid + 1;
        }
        
        return false;
    }
}