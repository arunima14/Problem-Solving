class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low; i<=high; i++){
            if(isSymmetric(i))
                count++;
        }

        return count;
    }

    public boolean isSymmetric(int x){
        String num = Integer.toString(x);
        int len = num.length();

        if(len%2 != 0)
            return false;
        else{
            int leftSum = 0;
            for(int i=0; i<len/2; i++)
                leftSum += num.charAt(i)-'0';

            int rightSum = 0;
            for(int i=len/2; i<len; i++)
                rightSum += num.charAt(i)-'0';

            return leftSum==rightSum;
        }
    }
}