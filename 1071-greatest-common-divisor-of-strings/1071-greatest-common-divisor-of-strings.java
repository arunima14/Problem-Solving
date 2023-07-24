class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int a = str1.length();
        int b = str2.length();
        
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        return str1.substring(0, gcd(a, b));
    }
    
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}