class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0) 
            return 0;
        
        int i = 0, num = 0, sign = 1, bound = Integer.MAX_VALUE/10;
        while (i<s.length() && s.charAt(i) == ' ') 
            i++;
        if (i == s.length()) 
            return 0;
        if (s.charAt(i) == '-'){
            sign = -1; 
            i++;
        }
        
        else if (s.charAt(i) == '+')
            i++;
        
        while (i<s.length() && Character.isDigit(s.charAt(i))) 
        {
            int digit = (s.charAt(i)-'0');
            if (num > bound || (num == bound && digit>7))
            {
                if (sign == 1) 
                    return Integer.MAX_VALUE;
                else 
                    return Integer.MIN_VALUE;
            }
            num = num*10 + digit;
            i++;
        }
        return num*sign;
    }
}