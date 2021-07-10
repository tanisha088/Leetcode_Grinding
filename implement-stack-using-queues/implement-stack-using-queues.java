class MyStack {

    /** Initialize your data structure here. */
    
    LinkedList<Integer> list1 ;
    LinkedList<Integer> list2;
    public MyStack() {
        list1 = new LinkedList<Integer>();
        list2 = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        
        while(!list1.isEmpty())
            list2.add(list1.pop());
        
        list1.add(x);
        while(!list2.isEmpty())
            list1.add(list2.pop());
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        
        return list1.pop();
    }
    
    /** Get the top element. */
    public int top() {
        
        return list1.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        
        return list1.isEmpty();
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