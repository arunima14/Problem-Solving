class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1)
                return stones[0];
        
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<stones.length;i++){
            arr.add(stones[i]);
        }
        Collections.sort(arr);
        while(arr.size()>1){
            int a=arr.get(arr.size()-1);
            int b=arr.get(arr.size()-2);
            arr.remove(arr.size()-1);
            arr.remove(arr.size()-1);
            arr.add(a-b);
            Collections.sort(arr);
        }
        return arr.get(0);
    }
}