class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int sLength = s.length();
        int tLength = t.length();

        if (sLength == 0) {
            return true;
        }

        for (int i = 0; i < tLength && count < sLength; i++) {
            if (t.charAt(i) == s.charAt(count)) {
                count++;
            }
        }

        if (count == sLength) {
            return true;
        } else {
            return false;
        }
    }
}