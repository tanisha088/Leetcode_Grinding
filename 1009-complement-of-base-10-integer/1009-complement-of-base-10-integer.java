class Solution {
    public int bitwiseComplement(int n) {
        
        if(n==0)
            return 1;
        int num=0;
        int i=0;
        while(n!=0)
        {
            int k= n&1;
            if(k==0)
                num|= (1<<i);
            n=n>>1;
            i++;
        }
        
        return num;
    }
}