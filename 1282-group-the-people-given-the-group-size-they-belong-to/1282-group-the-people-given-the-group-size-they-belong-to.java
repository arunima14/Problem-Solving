class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<Integer> groupSizesList = new ArrayList<>();
        for(int groupSize : groupSizes){
            groupSizesList.add(groupSize);
        }
        
        Arrays.sort(groupSizes);
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0; i<groupSizes.length; i++){
            int count = 0;
            List<Integer> list = new ArrayList<>();
            while(groupSizesList.indexOf(groupSizes[i]) != -1){
               if(list.size() == groupSizes[i])
                    break;
                list.add(groupSizesList.indexOf(groupSizes[i]));
                groupSizesList.set(groupSizesList.indexOf(groupSizes[i]), -1);
                count++;
            }
            i += count-1;
            result.add(list);
        }
        
        return result;        
    }
}