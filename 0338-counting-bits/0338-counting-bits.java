class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        
        for(int i=0; i<=n; i++){
            res[i] = bitsInBinary(i);
        }
        
        return res;
    }
    
    int bitsInBinary(int num){
        int count = 0;
        String bin = Integer.toBinaryString(num);
        
        for(int i=0; i<bin.length(); i++){
            if(bin.charAt(i) == '1')
                count++;
        }
        
        return count;
    }
}