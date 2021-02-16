class Solution {
    public int findKthNumber(int m, int n, int k) {
         
        int lo=1;
        int hi=m*n;
        
        while(lo<=hi)
        {
            int mid=lo + (hi-lo)/2;
            int res=0;
            for(int i=1;i<=n;i++)
               res +=Math.min(mid/i,m);            

           
             if(res<k)
                lo=mid+1;
            else
                hi=mid-1;
        }
        
        return lo;
    }
}