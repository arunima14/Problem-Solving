class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 1; 
        long end = num;
        
        if(num == 1)
            return true;
        
        while(start <= end){
            long mid = start + (end - start)/2;
            long sq = mid * mid;
            
            if(sq == num)
                return true;
            if(sq > num)
                end = mid - 1;
            else
                start = mid + 1;
        }
        
        return false;
    }
}