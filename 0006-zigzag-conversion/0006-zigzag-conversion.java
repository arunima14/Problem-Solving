class Solution {
    public String convert(String s, int numRows) {
        int l = s.length();

        if(l<3 || numRows==1)
            return s;
        
        StringBuilder[] sb = new StringBuilder[numRows];
        int row = 0, dir = 0;

        for(int i=0; i<sb.length; i++){
            sb[i] = new StringBuilder();
        }

        for(int i=0; i<l; i++){
            char ch = s.charAt(i);
            row += dir;
            sb[row].append(ch);

            if(row==0 || row==numRows-1)
                dir = (dir==0) ? 1 : -dir;
        }

        return convert(sb);
    }

    public String convert(StringBuilder[] sbs){
        StringBuilder result = new StringBuilder();

        for(StringBuilder sb : sbs){
            result.append(sb.toString());
        }

        return result.toString();
    }
}