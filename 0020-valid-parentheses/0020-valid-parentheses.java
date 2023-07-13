class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch=='(' || ch=='{' || ch=='[')
                stack.push(ch);
            
            else if(!stack.isEmpty() && (ch==')' || ch=='}' || ch==']')){
                char top = stack.peek();
                if(top=='(' && ch==')')
                    stack.pop();
                else if(top=='{' && ch=='}')
                    stack.pop();
                else if(top=='[' && ch==']')
                    stack.pop();
                else
                    return false;
            }
            
            else
                return false;
        }
                        
        return stack.isEmpty();
    }
}