class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> bracket = new Stack<>();
        Stack<Integer> index = new Stack<>();
        index.push(-1);
        List<Integer> len = new ArrayList<>();
        int longest = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                bracket.push(ch);
                index.push(i);
            }
            
            if(ch == ')'){
                if(bracket.isEmpty()){
                    index.push(i);
                }
                else if(bracket.peek()=='('){
                    bracket.pop();
                    index.pop();
                    int top = index.peek();
                    int l = i-top;
                    len.add(l);
                }
            }
        }
        
        for(int i=0; i<len.size(); i++)
            longest = (int)Math.max(longest, len.get(i));
        
        
        return longest;
    }
}