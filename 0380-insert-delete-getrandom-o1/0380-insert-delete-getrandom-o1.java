import java.util.*;
class RandomizedSet {
    List<Integer>  nums;
    Map<Integer, Integer> map;
    Random rand = new Random();
    public RandomizedSet() {
        nums = new ArrayList<Integer>();
        map = new HashMap<Integer, Integer>();
    }
    
    public boolean insert(int val) {
        if(nums.contains(val))
            return false;

        map.put(val, nums.size());
        nums.add(val);
        return true;
          
    }
    
    public boolean remove(int val) {
        if(!nums.contains(val))
            return false;

        int i=map.get(val);
        if(i < nums.size()-1){
            int last = nums.get(nums.size()-1);
            nums.set(i, last);
            map.put(last, i);
        }

        nums.remove(nums.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */