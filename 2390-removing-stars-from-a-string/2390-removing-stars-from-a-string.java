class Solution {
    public String removeStars(String s) {
        StringBuilder st = new StringBuilder(s);
        
        for(int i=0; i<st.length(); i++){
            char ch = st.charAt(i);
            
            if(ch == '*'){
                if(i==0){
                    st.deleteCharAt(i);
                    i=0;
                }
                else{
                    st.deleteCharAt(i);
                    st.deleteCharAt(i-1);
                    i=i-2;
                }
            }
        }
        
        return st.toString();
    }
}