class Solution {
    public int monotoneIncreasingDigits(int n) {
        
        Stack<Integer> st = new Stack<Integer>();
        int ind=-1;
        char[] arr = Integer.toString(n).toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(st.isEmpty())
                st.push(i);
            else
            {
                if(arr[i]-'0'<arr[st.peek()]-'0')
                {
                    int m = st.pop();
                     ind=m;
                    while(!st.isEmpty() && arr[st.peek()]-'0'==arr[m]-'0')
                    {
                        ind  = st.pop();
                    }
                    
                    break;
                    
                }
                else
                    st.push(i);
            }
        }
        
        
        if(ind==-1)
            return n;
        
        System.out.println(ind);
        arr[ind]=(char)(arr[ind]-1);
        
        for(int i=ind+1;i<arr.length;i++)
            arr[i]='9';
        
        String res= "";
        
        for(char c:arr)
            res=res+c;
        
        return Integer.parseInt(res);
    }
}


/*

47632
>= peek --> ok
< peek --> peek -> pop till peek == popped peak --> decrease tje ciiremt amd pisj ---> cirrem peek index


4 6 9 9 9
x<=y --->   val > peek ---> go --> peek == underpeek 
*/



