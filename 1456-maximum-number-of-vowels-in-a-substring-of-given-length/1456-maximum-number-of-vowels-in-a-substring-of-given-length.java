class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int l = 0, r = 0, result = 0, currVowel=0;

        while( r < s.length() ){
            if( vowels.contains(s.charAt(r)) ) {
                currVowel++;
            }
            if( r-l +1 == k ) {
                result = Math.max(currVowel, result );
                if( result == k )  
                    return k;

                if( vowels.contains(s.charAt(l) ) ) currVowel--;
                    l++;
            }
            r++;
        }

        return result;
    }
}