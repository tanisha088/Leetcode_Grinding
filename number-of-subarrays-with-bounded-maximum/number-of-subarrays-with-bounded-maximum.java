class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {

          int sum1 =1;
        int sum2=1;
        int ans=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>R)
                sum1=0;
          
                ans=ans+sum1;
            sum1+=1;
        
            if(A[i]>=L)
                sum2=0;
            
            ans=ans-sum2;
            sum2+=1;
        //    System.out.println(ans+" "+i+" "+sum1);
        }
        
        /*
int ans2=0;        
         for(int i=0;i<A.length;i++)
        {
            if(A[i]>=L)
            {
                ans2+=sum2;
                sum2=0;
                continue;
            }
            else
                sum2= sum2 + sum2+ 1;
              if(i==A.length-1)
                ans2+=sum2;
                
        }
        */
     System.out.println(ans);
        return ans;
    }
}

