class CustomStack {
    
    int[] arr;
Stack<Integer> st;
    public CustomStack(int maxSize) {
        arr = new int[maxSize+1];
     st = new Stack<Integer>();
    }
    
    public void push(int x) {
        
      //  System.out.println(x+"***");
        
        if(st.size()==arr.length-1)
            return;
            
        st.push(x);
        
       // System.out.println(st);
    }
    
    public int pop() {
        
        if(st.size()==0)
            return -1;
        int j1 = arr[st.size()];
        int el = st.pop();
        arr[st.size()]+=j1;
        arr[st.size()+1]-=j1;
     //   System.out.println(el+" "+j1);
        return el+j1;
        
    }
    
    public void increment(int k, int val) {
        
        int size =Math.min(st.size(),k);
        
        arr[size]+=val;
        
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 
 
 s1  --->  1 2
 s2  --->  
 
 stack -> 1 2 
 
 */

