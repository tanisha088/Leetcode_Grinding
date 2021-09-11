class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> st;
    Stack<Integer> st1;
    
    public MyQueue() {
        
        st = new Stack();
        st1 = new Stack();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
     
       
        st.push(x);
    }
            
        
        
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        
        if(!st1.isEmpty())
            return st1.pop();
        
        while(!st.isEmpty())
            st1.push(st.pop());
        
        return st1.pop();
    }
    
    /** Get the front element. */
    public int peek() {
                if(!st1.isEmpty())
            return st1.peek();
        
         while(!st.isEmpty())
            st1.push(st.pop());
        
        return st1.peek();
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        
        
        return (st.isEmpty() && st1.isEmpty())?true:false;
    }
}

/*** 


/**   
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */