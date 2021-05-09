class Solution {
    public int maxSumMinProduct(int[] arr) {
        Stack<Integer> st = new Stack<Integer>();
        int mod=1000000007;
        int[] sor = new int[arr.length];
        int[] sol = new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
            sor[i]=-1;
            sol[i]=-1;
        }
        int i = arr.length-2;
        st.push(i+1);
        while(i>=0)
        {
            if(arr[st.peek()]>=arr[i])
            {
                 while(!st.isEmpty() && arr[st.peek()]>=arr[i])
                    st.pop();
               if(!st.isEmpty())
                   sor[i]=st.peek();
                st.push(i);
            }
            else if(arr[st.peek()]<arr[i])
            {
                sor[i]=st.peek();
                st.push(i);
            }
            i--;
        }
    st = new Stack<Integer>();
        i = 1;
        st.push(0);
        
           while(i<arr.length)
        {
            if(arr[st.peek()]>=arr[i])
            {
                while(!st.isEmpty() && arr[st.peek()]>=arr[i])
                    st.pop();
               if(!st.isEmpty())
                   sol[i]=st.peek();
                st.push(i);
                
            }
            else if(arr[st.peek()]<arr[i])
            {
                sol[i]=st.peek();
                st.push(i);
            }
               i++;
        }
        long[] psum= new long[arr.length];
        psum[0]=arr[0];
        for(i=1;i<arr.length;i++)
        {
            psum[i]=(long)arr[i]+psum[i-1];
        }
        
    
      long maxval=0;
        for( i=0;i<arr.length;i++)
        {
            long ans=0;
            if(sol[i]==-1 && sor[i]==-1)
                ans=((long)psum[arr.length-1]*(long)arr[i]);
            else if(sol[i]==-1)
                ans=((long)(psum[sor[i]-1])*(long)arr[i]);
            else if(sor[i]==-1)
                ans=((long)(psum[arr.length-1]-psum[sol[i]])*(long)arr[i]);
            else
                ans=((long)(psum[sor[i]]-arr[sor[i]]-psum[sol[i]])*(long)arr[i]);
            maxval=Math.max(ans,maxval);
        }
        
        return (int)(maxval%mod);
    }
    
}