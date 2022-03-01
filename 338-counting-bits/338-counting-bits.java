class Solution {
    public int[] countBits(int n) {
        
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            arr[i] = setbits(i);
           
        }
        return arr;
    }
    
    public int setbits(int i)
    {
         int co = 0;
            while(i!=0)
            {
                if((i&1)==1)
                    co++;
                i=i>>1;
            }
            
            return  co;
    }
}