class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] counts = new int[26];
        for(int i=0; i<chars.length(); i++)
        {
            counts[chars.charAt(i) - 'a']++;
        }
        int count = 0 ;
        for(String s : words)
        {
            if(isWordPossible(s,counts))
                count += s.length();
        }
        return count;
    }

    boolean isWordPossible(String word, int[] counts)
    {
        int[] c = new int[26];
        for(int i=0; i<word.length(); i++)
        {
            int x = word.charAt(i) - 'a';
            c[x]++;
            if(c[x] > counts[x])
                return false;
        }
        return true;
    }
}