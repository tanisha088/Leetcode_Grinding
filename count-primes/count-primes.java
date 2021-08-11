class Solution {
    public int countPrimes(int n) {
        
        boolean[] ans =  new boolean[n+1];
        if(n<2)
            return 0;
        ans[0]=true;
        ans[1]=true;
        
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(ans[i]==true)
                continue;
            
            for(int j=i+i;j<=n;j+=i)
                ans[j]=true;
        }
        
        int res=0;
        
        for(int i=0;i<n;i++)
          {  if(!ans[i])
                res+=1;
      //      System.out.println(ans[i]);
          }
        return res;
    }
}