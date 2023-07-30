class Solution {
    private int begin, end, depth;

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            getSubstringForIndex(s, i, i);
            getSubstringForIndex(s, i, i + 1);

        }

        return s.substring(begin, end);
    }

    private void getSubstringForIndex(String source, int leftIndex, int rightIndex) {
        while (leftIndex >= 0 && rightIndex < source.length() && source.charAt(leftIndex) == source.charAt(rightIndex)) {
            leftIndex--;
            rightIndex++;
        }
        leftIndex++;
        if (rightIndex - leftIndex > depth) {
            depth = rightIndex - leftIndex;
            begin = leftIndex;
            end = rightIndex;
        }
    }
}