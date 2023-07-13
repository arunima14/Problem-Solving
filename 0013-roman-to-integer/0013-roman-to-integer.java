class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int number = 0, i;
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        for(i=0; i<s.length()-1; i=i+2){
            char ch = s.charAt(i);
            char next = s.charAt(i+1);
            
            if(map.get(ch) > map.get(next)){
                number += map.get(ch);
                i--;
            }else if(map.get(ch) < map.get(next)){
                number += map.get(next) - map.get(ch);
                // i++;
            }
            else
                number += map.get(ch) + map.get(next);
        }
        
        if(i == s.length()-1)
            number += map.get(s.charAt(s.length()-1));
        
        return number;
    }
}