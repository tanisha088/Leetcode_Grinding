class Solution {
    public int countGoodNumbers(long n) {
        int mod=1000000007;
        long even = n/2;
        long odd =n/2;
        
          if(n%2!=0)
            even = n/2+1;
            odd = n/2;
      
        long k1 = pow(5,even,mod);
        
        long k2 = pow(4,odd,mod);
        
        
        long m = (k1%mod*k2%mod)%mod;
 
       return (int)m;
    
        
    }
    
    public long pow(long a,long b,int mod)
    {
        long res=1;
        long val = a;
        
        while(b>0)
        {
             
          
            
          //  System.out.println((b&1)+" *******"+ val);
            if((b&1)==1)
                res=(res%mod*val%mod)%mod;
           
              val=(val%mod*val%mod)%mod;
            b=b>>1;
        }
        
        return res%mod;
    }
}