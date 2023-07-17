import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        int length = 0;
        
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            length = str.length();
        }
        
        return length;
    }
}