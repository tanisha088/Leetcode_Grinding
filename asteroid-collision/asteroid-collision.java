class Solution {
    public int[] asteroidCollision(int[] asteroids) {
     /*
        Stack<Integer> st= new Stack<Integer>();
        for(int i=0;i<asteroids.length;i++)
        {
            if(asteroids[i]>0)
                st.push(asteroids[i]);
            else
            {
               while(!st.isEmpty() && Math.abs(asteroids[i])>st.peek())
               {
                   st.pop();
               }
                if(st.peek()==Math.abs(asteroids[i]))
                    st.pop();
            }
        }
        */
        
         Stack<Integer> st= new Stack<Integer>();
        for(int i=0;i<asteroids.length;i++)
        {
            if(asteroids[i]<0 && !st.isEmpty() && st.peek()>0)
            {
               int m = Math.abs(asteroids[i]);
               while(!st.isEmpty() && st.peek()>0 && st.peek()<m)
                   st.pop();
               
               if(st.isEmpty() || st.peek()<0)
                   st.push(asteroids[i]);
               else if(st.peek()==m)
                   st.pop();
            }
             else
                st.push(asteroids[i]);
        }
        
        int[] arr = new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty())
        {
           arr[i]=st.pop();
            i--;
        }
        
        return arr;
    }
}

//10 5 -5 -10