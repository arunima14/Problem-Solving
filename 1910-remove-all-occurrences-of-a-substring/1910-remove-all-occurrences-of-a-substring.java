class Solution {
    public String removeOccurrences(String s, String part) {
        if(part.equals(""))
            return s;
        
        int index = s.indexOf(part);
        while(index != -1){
            s = s.substring(0, index) + s.substring(index+part.length());
            index = s.indexOf(part);
        }
        
        return s;
    }
}