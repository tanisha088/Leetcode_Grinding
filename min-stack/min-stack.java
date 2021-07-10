class MinStack {

    /** initialize your data structure here. */ 
    Stack<Long> st;
    long min=Long.MAX_VALUE;
    public MinStack() {
        st  = new Stack<Long>();
    }
    
    public void push(int val) {
        
        if(st.isEmpty())
        {
            st.push((long)val);
             min=val;
        }
        else
        {
           st.push((val-min));
            min=Math.min(val,min);
            
      //      System.out.println(st +" "+min);
        }
    }
    
    public void pop() {
        long m = st.pop();
        if(m<0)
        {
            min = min-m;
        }
        
    }
    
    public int top() {
        long k1 = st.pop();
        if(st.isEmpty())
        {
            st.push(k1);
            return (int)k1;
        }
        else
        {
            st.push(k1);
            if(st.peek()<0)
                return (int)min;
            else
        return (int)(st.peek()+min);
        }
    }
    
    public int getMin() {
 //       System.out.println(min+"****");
      return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin(); 
 

-2 , 0 , -3 , 3 , 1

-2  , 2 , -1 ,

min=-2
push :  val-min
pop  :-> >0 ==>  val+min

if < 0  ==> then this value is the current min itself ->  we find new min-> curr_min- val 

2147483646****
2147483646****
2147483647****
-2147483648****
2147483647****



 */