class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
          if(freqMap.containsKey(nums[i])){
              int value = freqMap.get(nums[i]);
              freqMap.put(nums[i], value+1);
          }else{
              freqMap.put(nums[i], 1);
          }
        }
        
        Iterator value = freqMap.entrySet().iterator();
        
        while(value.hasNext()){
            Map.Entry mapElement
                = (Map.Entry)value.next();
            int freq = (int)mapElement.getValue();
            
            
            if(freq == 1)
                return (int)mapElement.getKey();
        }
        
        
        return -1;
    }
}