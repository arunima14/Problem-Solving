import java.util.*;
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        // Arrays.sort(words);
        
        for(String word : words){
            if(map.containsKey(word))
                map.put(word, map.get(word)+1);
            else
                map.put(word, 1);
        }
        
        List<String> result = new ArrayList<>(map.keySet());
        
        Collections.sort(result, (x,y) ->{
            if(map.get(y) == map.get(x)){
                return x.compareTo(y);
            }
            return map.get(y)-map.get(x);
        });

        return result.subList(0,k);
    }
    
}