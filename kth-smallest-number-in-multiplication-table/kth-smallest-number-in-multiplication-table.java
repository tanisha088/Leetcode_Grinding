class Solution {
    public int findKthNumber(int m, int n, int k) {
         
        int lo=1;
        int hi=m*n;
        
        while(lo<=hi)
        {
            int mid=lo + (hi-lo)/2;
            int less=0;
            int more=0;
            for(int i=1;i<=n;i++)
            {
                int find = mid-1;
               less = less + Math.min(find/i,m);
                more=more+Math.min(mid/i,m);
            }
            
          //  System.out.println(mid+" "+less+" "+more);
            if(k>less && k<=more)
                return mid;
            else if(less<k)
                lo=mid+1;
            else
                hi=mid-1;
        }
        
        return 0;
    }
}