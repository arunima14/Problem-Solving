class Solution {
    public String removeOccurrences(String s, String part) {
        boolean t = true;
    while (t == true) {
        int pos = s.indexOf(part);
        if (pos != -1) {
            s = s.substring(0, pos) + s.substring(pos + part.length());
        } else {
            t = false;
        }
    }
    return s;
    }
}