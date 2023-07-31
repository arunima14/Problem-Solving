class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> final_list = new ArrayList<>();
        find_combination(0,candidates, final_list,new ArrayList<>(),target);
        return final_list;
    }
    
    public static void find_combination(int index,int arr[],List<List<Integer>>final_list,List<Integer>lst,int target)
    {
        if(index==arr.length) // base condition
        {
            if(target==0)
                final_list.add(new ArrayList<>(lst)); //add the sublist to the final list
            return;    
        }
        if(arr[index]<=target)   //code for picking the element
        {
            lst.add(arr[index]);
            find_combination(index, arr, final_list, lst, target-arr[index]);
            lst.remove(lst.size()-1);
        }

        find_combination(index+1, arr, final_list, lst, target);
    }
}