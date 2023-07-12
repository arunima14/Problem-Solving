class MyStack {
    
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
    }
    
    public void push(int x) {
        q2.add(x);
        while(!empty()){
            int topElement = top();
            q2.add(topElement);
            int deletedElement = pop();
        }
        
        //swap q1 and q2
        q1.addAll(q2);
        q2.clear();
    }
    
    public int pop() {
       return q1.remove(); 
    }
    
    public int top() {
        if(!empty())
            return q1.peek();
        return -1;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */