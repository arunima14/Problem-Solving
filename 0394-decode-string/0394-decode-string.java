class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        String res = "";
        
        for(int i=0; i<s.length(); i++){
            String ch = Character.toString(s.charAt(i));
            if(ch.equals("]")){
                String repetion = "";
                while(!stack.isEmpty() && !stack.peek().equals("[")){
                    repetion = stack.peek() + repetion;
                    stack.pop();
                }
                
                // return repetion;
                
                stack.pop();    // removes "[" from the stack
                
                //now the number starts
                String t="";
                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
                    t = stack.peek() + t;
                    stack.pop();
                }
                int times = Integer.parseInt(t);
                String str = "";
                for(int j=0; j<times; j++)
                    str += repetion;
                
                // stack.pop();    // removes the number
                
                if(stack.isEmpty())
                    res += str;
                else
                    stack.push(str);
            }
            else
                stack.push(ch);
        }
        
        String st = "";
        while(!stack.isEmpty()){
            st = stack.peek() + st;
            stack.pop();
        }
        
        return res+st;
    }
}