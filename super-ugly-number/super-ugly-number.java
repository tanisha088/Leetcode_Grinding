class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        
        int[] counter  = new int[primes.length];
        for(int i=0;i<counter.length;i++)
            counter[i]=1;
        int[] ans=  new int[n+1];
        ans[1]=1;
        for(int i=2;i<=n;i++)
        {
            
            int val =Integer.MAX_VALUE;
            for(int j=0;j<counter.length;j++)
            {
                val = Math.min(ans[counter[j]]*primes[j],val);
            }
            
            for(int j=0;j<counter.length;j++)
            {
                if(ans[counter[j]]*primes[j]==val)
                    counter[j]++;
            }
      //      System.out.println(val);
         ans[i]=val;  
        }
        
        return ans[n];
    }
}