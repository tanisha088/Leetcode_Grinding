class Solution {
    public int countVowelPermutation(int n) {
 int mod =1_000_000_007;
        
        long[] arr = new long[]{1,1,1,1,1};
        
        for(int i=1;i<n;i++)
        {
            long[] a1 = new long[5];
            a1[0] = (arr[1]%mod+arr[2]%mod+arr[4]%mod)%mod;
            a1[1] = (arr[0]%mod+arr[2]%mod)%mod;
            a1[2] = (arr[1]%mod+arr[3]%mod)%mod;
            a1[3] = (arr[2])%mod;
            a1[4] = (arr[2]%mod+arr[3]%mod)%mod;
            
            arr  = a1;
        }
        long sum=0;
        for(int i=0;i<5;i++)
            sum = (sum%mod + arr[i]%mod)%mod;
        
        return (int)(sum%mod);
    }
}