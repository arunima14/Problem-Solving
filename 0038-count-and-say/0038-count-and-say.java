class Solution {
    public String countAndSay(int n) {
        StringBuilder curr = new StringBuilder("1");

        for (int i = 1; i < n; i++) {
            StringBuilder next = new StringBuilder();
            char c = curr.charAt(0);
            int count = 1;

            for (int j = 1; j < curr.length(); j++) {
                if (curr.charAt(j) == c) {
                    count++;
                } else {
                    next.append(count);
                    next.append(c);
                    c = curr.charAt(j);
                    count = 1;
                }
            }

            next.append(count);
            next.append(c);
            curr = next;
        }

        return curr.toString();
    }
}