class Solution {
    public int largestRectangleArea(int[] heights) {

        int[] sol = new int[heights.length];
        int[] sor = new int[heights.length];
        
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<heights.length;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
                st.pop();
            
            if(st.isEmpty())
                sol[i]=-1;
            else
                sol[i]=st.peek();
            
            st.push(i);
        }
        
        
     
        
        st = new Stack<Integer>();
        for(int i=heights.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
                st.pop();
            
            if(st.isEmpty())
                sor[i]=-1;
            else
                sor[i]=st.peek();
            
            st.push(i);
        }
         
        //   -1 -1
        
        
        int ans=0;
        
        for(int i=0;i<heights.length;i++)
        {
            int val=0;
            if(sol[i]==-1 && sor[i]==-1)
                val=heights.length*heights[i];
            else if(sol[i]==-1)
                val=sor[i]*heights[i];
            else if(sor[i]==-1)
                val=(heights.length-1-sol[i])*heights[i];
            else 
                val=(sor[i]-sol[i]-1)*(heights[i]);
                
            
            ans = Math.max(val,ans);
        //    System.out.println(sol[i]+" "+sor[i]);
        }
        
           // sol ->  -1 -1  1 2 1 4
        // sor ->     1 -1 4 4 -1 -1
        //     10 
        
       
        return ans;
        
    }
}


//a b c d e f

//f-b+1
    
    
  //  -b+arr.length-1


//  2 1 5 6 2 3  

// 1 2 3 2 1 2 2      








