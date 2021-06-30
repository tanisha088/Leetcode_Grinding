class Solution {
    public int minDominoRotations(int[] A, int[] B) {
                                                                     
      int a=A[0];
        int b=B[0];
        int ans=-1;                                             
                                                                  
        for(int i=1;i<A.length;i++)
        {
            int c= A[i];
            int d= B[i];
            
           if(a!=c && a!=d && b!=c && b!=d)
               return -1;

            
            if(a==b && (a==c || a==d))
            {
                ans=a;
                break;
            }

            if((a==c || a==d) && (b!=c && b!=d))
            {
                ans=a;
                break;
                
            }
                                                          
            if((b==c || b==d) && (a!=c && a!=d))
            {
                ans=b;
                break;
            }

        }
                                                                    
        if(ans==-1)
            return -1;
                                                 
        int c1=0;
        int c2=0;
                                                         
        for(int i=0;i<A.length;i++)
        {
            if(A[i]!=ans && B[i]!=ans)
                return -1;
                                                        
            if(A[i]==ans)
                c1++;
                                                               
            if(B[i]==ans)
                c2++;
        }
        
        return Math.min(B.length-c1,B.length-c2);                                                  
       // return ans;
    }
}
