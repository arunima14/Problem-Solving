import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        List<String> vowels = new ArrayList<>();
        StringBuilder str = new StringBuilder(s);
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                vowels.add(String.valueOf(ch));
        }
        
        int index = vowels.size() - 1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                str.replace(i, i+1, vowels.get(index));
                index --;
            }
        }
        
        return str.toString();
    }
}