class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if(n == 1)
            return 1;
        StringBuilder s = new StringBuilder();
        
        for(int i=0; i<chars.length-1; i++){
            char ch = chars[i];
            s.append(ch);
            
            int count = 1;
            while((i<chars.length-1) && (chars[i+1] == ch)){
                count++;
                i++;
            }
            
            if(count > 1)
                s.append(count);
        }
        
        if(chars[n-1] != chars[n-2])
            s.append(chars[n-1]);
        
        // char[] arr = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            chars[i] = s.charAt(i);
        }
        
        return s.length();
    }
}