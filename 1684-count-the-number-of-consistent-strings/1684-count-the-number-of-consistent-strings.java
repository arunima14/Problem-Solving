import java.util.*;
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count = 0;
        
        Set<Character> allowedChars = new HashSet<>();
        for(int i=0; i<allowed.length(); i++)
            allowedChars.add(allowed.charAt(i));
        
        
        for(String word : words){
            boolean consistent = isConsistent(word, allowedChars);
            if(consistent)
                count++;
        }
        
        return count;
    }
    
    boolean isConsistent(String word, Set<Character> allowedChars){
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(!allowedChars.contains(ch)){
                return false;
            }
        }
        
        return true;
    }
}