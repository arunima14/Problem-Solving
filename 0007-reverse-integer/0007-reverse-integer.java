class Solution {
    public int reverse(int x) {
        // int n = 0;
        // while(x > 0){
        //     int digit = x%10;
        //     n += digit;
        //     n = n*10;
        //     x = x/10;
        // }

        // n = n/10;
        // if(n>Integer.MAX_VALUE || n<Integer.MIN_VALUE)
        //     return 0;


        // // if(x < 0){
        // //     n = (int)(-1 * n);
        // // }

        // return (int)n;

        int ans = 0;
        while (x != 0)
        {
            if (ans > 214748364 || ans < -214748364)
            {
                return 0;
            }
            
            ans = ans * 10 + x % 10;
            x /= 10;
        }  
        return ans;
    }
}