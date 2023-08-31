class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        
        for(int i=0; i<=s.length()-p.length(); i++){
            String str = s.substring(i, i+p.length());
            if(isAnagram(p, str))
                res.add(i);
        }
        
        return res;
    }
    
    boolean isAnagram(String p, String s){
        int[] char_p = new int[26];
        int[] char_s = new int[26];
        
        for(int i=0; i<p.length(); i++){
            char ch = p.charAt(i);
            char_p[ch-'a']++;
        }
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            char_s[ch-'a']++;
        }
        
        return Arrays.equals(char_p, char_s);
    }
}