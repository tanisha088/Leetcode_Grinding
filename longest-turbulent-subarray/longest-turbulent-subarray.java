class Solution {
    public int maxTurbulenceSize(int[] arr) {
        
        int st=0;
        boolean fg = false;
        boolean fl = false;
        
      
        int i=0;

        int ans=1;
        boolean k = true;
        
        for(;i<arr.length-1;i++)
        {
           
            if(arr[i]==arr[i+1])
            {
              ans=Math.max(ans,i-st+1);
                k=true;
                st=i+1;
                continue;
            }
            
            if(k)
            {
                fg=false;
                fl=false;
              if(arr[i]>arr[i+1])
                  fg=true;
            else
                fl=true;
                
                 k=false;
                continue;
            }
          
            if(fg)
            {
                if(arr[i]>=arr[i+1])
                {
                    ans = Math.max(ans,i-st+1);
                    st=i;
                }
                else
                {
                    fg=false;
                    fl=true;
                }
            }
            else
            {
                if(arr[i]<=arr[i+1])
                {
                    ans =Math.max(ans,i-st+1);
                    st=i;
                }
                else
                {
                    fl=false;
                    fg=true;
                }
            }
        }
        ans = Math.max(ans,i-st+1);
        return ans;
    }
}

   
   
    
