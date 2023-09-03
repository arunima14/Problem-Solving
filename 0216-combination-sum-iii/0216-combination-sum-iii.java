class Solution {
    private void solve(List<List<Integer>>ans, List<Integer>temp, int can[], int target, int sum, int idx, int n, int len){
        if(idx >= n){
            if(sum==target && temp.size()==len){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.add(can[idx]);
        sum+=can[idx];
        solve(ans, temp, can, target, sum, idx+1, n, len);
        temp.remove(temp.size()-1);
        sum-=can[idx];

        solve(ans, temp, can, target, sum, idx+1, n, len);
    }
    public List<List<Integer>> combinationSum3(int len, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        int sum=0;
        int idx=0;
        int can[]=new int[9];
        for(int i=1;i<=9;i++) can[i-1]=i;
        List<Integer>temp=new ArrayList<>();
        solve(ans, temp, can, target, sum, idx, 9, len);
        return ans;
        
    }
}