class Solution {
    public int maxTurbulenceSize(int[] A) {
        
        /*
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
        
        */
        
        /************************* 2ND APPROACH ********************************/
        
        
//           int inc = 1, dec = 1, result = 1;
//         for (int i = 1; i < A.length; i++) {
//             if (A[i] < A[i - 1]) {
//                 dec = inc + 1;
//                 inc = 1;
//             } else if (A[i] > A[i - 1]) {
//                 inc = dec + 1;
//                 dec = 1;
//             } else {
//                 inc = 1;
//                 dec = 1;
//             }
            
//             System.out.println(inc+" "+dec);
//             result = Math.max(result, Math.max(dec, inc));
//         }
//         return result;
    
        
        if(A.length<=1)
            return A.length;
        
        int ans =1;
        int i=0;
        while(i<A.length-1)
        {
          if(A[i]==A[i+1])
          {i++; continue;}
             if(A[i]<A[i+1])
            {
                int st=i;
                int c=0;
                i++;
                
                while(i<A.length-1)
                {
                    if(c%2!=0)
                       { 
                        if(A[i]<A[i+1]){ i++; c++;}
                    else { break;}}
                    else 
                      { if(A[i]>A[i+1]){ i++; c++;}
                    else {break;}}
                }
                ans=Math.max(ans,i-st+1);
                 
            }
            
          
          if(i>A.length-2)
              break;
             if(A[i]>A[i+1])
            {
                int st=i;
                int c=0;
                i++;
                
                while(i<A.length-1)
                {
                    
                     if(c%2==0)
                       { 
                        if(A[i]<A[i+1]){ i++; c++;}
                    else { break;}}
                    else 
                      { if(A[i]>A[i+1]){ i++; c++;}
                    else {break;}}
                }
                ans=Math.max(ans,i-st+1);
                
            }
                
        }
        
        
        return ans;
        
    }
}

   
   
    
