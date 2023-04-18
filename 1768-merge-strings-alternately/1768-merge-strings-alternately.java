class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0, j=0;
        String str = "";
        while(i<=word1.length() && j<=word2.length()){
            if(i>=word1.length()){
                str += word2.substring(j, word2.length());
                break;
            }
            else if(j>=word2.length()){
                str += word1.substring(i, word1.length());
                break;
            }
            
            str += word1.substring(i, i+1) + word2.substring(j, j+1);
            i++;
            j++;
        }
        
        return str;
    }
}
    