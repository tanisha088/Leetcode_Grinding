class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<Integer>();
        
        int i=0;
        int j=0;
        
       
        while(i<popped.length)
        {
      while(!st.isEmpty() && i<popped.length && st.peek()==popped[i])
{
     st.pop();
     i++;

}
            if(j==pushed.length)
                break;
     while(j<pushed.length)
           {
         
         
           st.push(pushed[j]);
         if(pushed[j]==popped[i])
             {j++; break;}
             j++;

        
           }
        }

return st.isEmpty()==true;

        

    }
}

/*  1 2 3 4 5 */


/*

while(i<popped.length)
{

if(!empty && st.peek()==popped[i])
{
     st.pop();
     i++;

}
     while(j<pushed.length)
           {
           
           st.push(pushed[j]);
             j++;
           if(pushed[j]==popped[i])
           {
         
            break;
           }
           }
           
           
}


return st.isEmpty()==true?


*/