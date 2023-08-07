class Solution {
    public int countGoodSubstrings(String s) {
        List <String> substrings = new ArrayList<>();
        
        for(int i=0; i<=s.length()-3; i++){
            substrings.add(s.substring(i, i+3));
        }
        
        int count = 0;
        for(String str : substrings){
            if(isGoodString(str))
                count++;
        }
        
        return count;
    }
    
    boolean isGoodString(String s){
        int[] lettersFreq = new int[26];
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            lettersFreq[c-'a']++;
            
            if(lettersFreq[c-'a'] > 1)
                return false;
        }
        
        return true;
    }
}