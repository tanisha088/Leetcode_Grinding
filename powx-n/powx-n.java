class Solution {
    public double myPow(double x, int n1) {
        // O(n) not possible since 2^31 is max possible which is >10^9 and O(n) not possible with n>10^9 .. so only left soln is log n
        
//         if(n1==0)
//             return 1;
        
//         if(n1%2==1)
//             return x*myPow(x*x,n1/2);
//         return myPow(x*x,n1/2);
        
        
        
        double val =  pow(Math.abs(x),Math.abs(n1));
       
        if(x<0 && Math.abs(n1)%2!=0)
            val= -1*val;
        
        if(n1==Integer.MIN_VALUE && Math.abs(x)!=1)
            return 0;
        
     //   System.out.println(val+" "+1/val);
        
        if(n1<0)
        {
            val  = 1/val;
        }
        System.out.println(Integer.MAX_VALUE);
        
        return val;
    }
    
    public double pow(double a,int b)
    {
        if(a==0)
            return 0;
        if(b==0)
            return 1;
        double ans = 1;
        double val =a;
        
        while(b>0)
        {
            if((b&1)==1)
            {
                ans = ans*val;
            }
            
            val = val*val;
            b = b>>1;
        }
        
        return ans;
    }
         /*   
     
     
     
     3^5  = 3^4  * 3
     
     
     101 -> 2^2 + 1
     
     
     
     
     
        //1 soln =>
      if(n1==0)
          return 1;
        double soln =1;
        
        long n =n1;
        long k = Math.abs(n);
        
       System.out.println(k+" "+n);
        
        long val = bs(0,k,k);
      
        for(long i=0;i<val;i++)
            soln=soln*x;
                System.out.println(soln);

        double result=soln;
        for(long i=1;i<val;i++)
            soln=result*soln;
        
      //  soln=soln*soln;
        System.out.println(soln);
        for(long i=val*val+1;i<=k;i++)
            soln=x*soln;
        
        if(n<0)
        {
            System.out.println(soln);
            return 1.000000/soln;
        }
        return soln;
    }
    
    public long  bs(long lo,long hi,long target)
    {
        double d = target+0.5;
        
        while(lo<=hi)
        {
            long mid =  lo + (hi-lo)/2;
            if(mid*mid==target)
                return mid;
            else if(mid*mid<d)
                lo=mid+1;
            else
                hi=mid-1;
        }
        
        return lo-1;
    }
    
    */
}