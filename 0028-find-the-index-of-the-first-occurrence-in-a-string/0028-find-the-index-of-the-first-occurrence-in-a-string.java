class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() == 0)
            return -1;
        
        int length = haystack.length() - needle.length() + 1;        
        for(int i=0; i<length; i++){
            String str = haystack.substring(i, i+needle.length());
            
            if(str.equals(needle))
                return i;
        }
        
        return -1;
    }
}