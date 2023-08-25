class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> occurences = new HashSet<>();
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            numbers.add(arr[i]);
            
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        for(int values : map.values()){
            occurences.add(values);
        }
        
        if(numbers.size() == occurences.size())
            return true;
        else
            return false;
    }
}