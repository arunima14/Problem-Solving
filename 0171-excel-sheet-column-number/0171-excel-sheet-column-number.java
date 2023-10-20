class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle == null)
            return -1;

        if(columnTitle.length() == 1)
            return (columnTitle.charAt(0)-'A') + 1;

        else{
            columnTitle.toUpperCase();
            int num = 0;
            for(int col : columnTitle.toCharArray()){
                num = num *26;
                num += (col-'A') + 1;
            }

            return num;
        }
    }
}