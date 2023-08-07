import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2)
            return s.length();
        int longest = 1;
        for(int i=0; i<s.length(); i++){
            List<Character> characters = new ArrayList<>();
            characters.add(s.charAt(i));
            int len = 1;
            
            for(int j=i; j<s.length()-1; j++){
                char ch = s.charAt(j+1);
                
                if(characters.contains(ch)){
                    characters.clear();
                    longest = (int)Math.max(longest, len);
                    break;
                }
                else{
                    characters.add(ch);
                    len++;
                }
            }
            longest = (int)Math.max(longest, len);
        }
        
        return longest;
    }
}