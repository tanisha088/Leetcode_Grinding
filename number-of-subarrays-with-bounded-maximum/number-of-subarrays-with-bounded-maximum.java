class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {

//           int sum1 =1;
//         int sum2=1;
//         int ans=0;
//         for(int i=0;i<A.length;i++)
//         {
//             if(A[i]>R)
//                 sum1=0;
          
//                 ans=ans+sum1;
//             sum1+=1;
        
//             if(A[i]>=L)
//                 sum2=0;
            
//             ans=ans-sum2;
//             sum2+=1;
//         //    System.out.println(ans+" "+i+" "+sum1);
//         }
        
//         /*
// int ans2=0;        
//          for(int i=0;i<A.length;i++)
//         {
//             if(A[i]>=L)
//             {
//                 ans2+=sum2;
//                 sum2=0;
//                 continue;
//             }
//             else
//                 sum2= sum2 + sum2+ 1;
//               if(i==A.length-1)
//                 ans2+=sum2;
                
//         }
//         */
//      System.out.println(ans);
//         return ans;
        
//         int ans=0;
//         int count=0;
//         int i=0;
//         int max=Integer.MIN_VALUE;
//         while(i<A.length)
//         {
//             max=Math.max(A[i],max);
//             if(max<=R && max>=L)
//             {
//                  if(max==A[i])
//                 count++;
                
//                 ans = ans + count;
               
//             }
//             else
//             {
//                 max=Integer.MIN_VALUE;
//                 count=0;
//             }
//             i++;
//         }
                                                                                            
//         return ans;
        
        int i=0;
        int ans=0;
        int s1=1;
        int s2=1;
    while(i<A.length)
    {
        if(A[i]>R)
        {
            s1=1;
            s2=1;
            i++;
            continue;
        }
      
        ans = ans + s1;
        s1++;
        
        if(A[i]>=L)
            s2=0;
        ans =  ans - s2;
        s2++;

       i++;

    }
        
        return ans;
        
        
    }
}

