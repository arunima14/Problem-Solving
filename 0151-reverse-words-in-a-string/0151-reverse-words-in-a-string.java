import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        StringBuilder sb = new StringBuilder("");
        
        while(st.hasMoreTokens()){
            sb.insert(0, " " + st.nextToken());
        }
        
        sb.delete(0, 1);
        return sb.toString();
    }
}