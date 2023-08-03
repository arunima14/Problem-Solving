class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        Map<Character, String> m = new HashMap<>();

        m.put('2', "abc");
        m.put('3', "def");
        m.put('4', "ghi");
        m.put('5', "jkl");
        m.put('6', "mno");
        m.put('7', "pqrs");
        m.put('8', "tuv");
        m.put('9', "wxyz");

        Map<Character, Integer> m2 = new HashMap<>();

        m2.put('a', 3);
        m2.put('b', 2);
        m2.put('c', 1);
        m2.put('d', 3);
        m2.put('e', 2);
        m2.put('f', 1);
        m2.put('g', 3);
        m2.put('h', 2);
        m2.put('i', 1);
        m2.put('j', 3);
        m2.put('k', 2);
        m2.put('l', 1);
        m2.put('m', 3);
        m2.put('n', 2);
        m2.put('o', 1);
        m2.put('p', 4);
        m2.put('q', 3);
        m2.put('r', 2);
        m2.put('s', 1);
        m2.put('t', 3);
        m2.put('u', 2);
        m2.put('v', 1);
        m2.put('w', 4);
        m2.put('x', 3);
        m2.put('y', 2);
        m2.put('z', 1);
        
        int k = digits.length();

        List<String> res = new ArrayList<>();

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < k ; i++)
            s.append(m.get(digits.charAt(i)));

        func(s, res, new StringBuilder(), k, 0, m2);
        return res;
    }

    void func(StringBuilder s, List<String> res, StringBuilder t, int k, int x, Map<Character, Integer> m2) {
        if (t.length() == k) {
            res.add(t.toString());
        }
        else {
            for (int i =x; i < s.length(); i++) {
                t.append(s.charAt(i));
                func(s,res,t,k, i+m2.get(s.charAt(i)), m2);
                t.deleteCharAt(t.length() - 1);
            }
        }
    }
}