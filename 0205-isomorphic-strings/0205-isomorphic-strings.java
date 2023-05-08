class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] arr = new int[150];
        for(int i=0;i<arr.length;i++){
            arr[i] = 1000;
        }
        boolean check = true;
        for(int i=0;i<s.length();i++){
            int n = (int)s.charAt(i);
            int val = (int)s.charAt(i) - (int)t.charAt(i);

            if(arr[n]==1000){
                arr[n] = val;
            }
            else if(arr[n]!=val){
                check = false;
                break;
            }
            else{
                continue;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = 1000;
        }
        boolean check1 = true;
        for(int i=0;i<t.length();i++){
            int n = (int)t.charAt(i);
            int val = (int)t.charAt(i) - (int)s.charAt(i);

            if(arr[n]==1000){
                arr[n] = val;
            }
            else if(arr[n]!=val){
                check1 = false;
                break;
            }
            else{
                continue;
            }
        }
        if(check==true && check1==true){
            return true;
        }
        return false;
    }
}