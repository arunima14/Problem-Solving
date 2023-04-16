class Solution {
    public int lengthOfLongestSubstring(String s) {

        // String str = "";
        // int max_len = 0, n = s.length();
        // for(int i=0; i<n; i++){
        //     char ch = s.charAt(i);
        //     String a = "" + ch;
        //     if(! str.contains(a)){
        //         str += a;
        //         int len = str.length();
        //     for(int j=i+1; j<n; j++){
        //         char c = s.charAt(j);
        //         String b = "" + c;
        //         if(str.contains(b))
        //         {
        //             str = str.substring(1, str.length());
        //         }

        //         str = str + b;
        //         len = str.length();

        //         max_len = (int)Math.max(len, max_len);
        //     }
        //     str="";
        //     }
        // }

        // return max_len;

        int n = s.length(), longest = 0;
        int[] nextIndex = new int[128]; 

        for (int r=0, l=0; r<n; r++) {
            l = Math.max(nextIndex[s.charAt(r)], l); 
            longest = Math.max(longest, r - l + 1);
            nextIndex[s.charAt(r)] = r + 1;
        }

        return longest;

    }
}