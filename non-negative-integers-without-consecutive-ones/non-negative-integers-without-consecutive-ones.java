class Solution {
    public int findIntegers(int num) {
        
        int[] fib = new int[32];
        fib[0]=1;
        fib[1]=2;
        fib[2]=3;
        for(int i=3;i<fib.length;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
        }
        boolean one=false;
        int k=30;
        int res=0;
        while(k>=0)
        {
            if((num&(1<<k))!=0)
            {
                res=res+fib[k];
                System.out.println(res+" "+k);
                if(one)
                {
                    return res;
                }
                one=true;
            }
            else
                one=false;
            
            k--;
        }
        
        return res+1;
    }
}