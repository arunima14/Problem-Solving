class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;
        
        else{
            int n = word1.length(); int m = word2.length();
            Map<Character, Integer> s1Map = new HashMap<>();
            Map<Character, Integer> s2Map = new HashMap<>();
            
            for(int i=0; i<n; i++)
                s1Map.put(word1.charAt(i), s1Map.getOrDefault(word1.charAt(i), 0)+1);
            
            for(int i=0; i<m; i++){
                if(!s1Map.containsKey(word2.charAt(i)))
                    return false;
                s2Map.put(word2.charAt(i), s2Map.getOrDefault(word2.charAt(i), 0)+1);
            }
            
            List<Integer> s1Occurences = new ArrayList();
            List<Integer> s2Occurences = new ArrayList();
            
            for(int values : s1Map.values())
                s1Occurences.add(values);
            
            for(int values : s2Map.values())
                s2Occurences.add(values);
            
            
            Collections.sort(s1Occurences);
            Collections.sort(s2Occurences);
            
            
            if(s1Occurences.equals(s2Occurences))
                return true;
            else
                return false;
        }
    }
}