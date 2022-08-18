class Solution {
    public int minSetSize(int[] arr) {
    
        int[] ar1 = new int[100001];
        
        for(int i=0;i<arr.length;i++)
        {
            ar1[arr[i]]+=1;
        }
        
        int[] freq = new int[100001];
        for(int i=0;i<ar1.length;i++)
            freq[ar1[i]]+=1;
        
        int sum=0;
        int count=0;
        
        for(int i=freq.length-1;i>=0 ;i--)
        {
            if(freq[i]==0)
                continue;
            
            System.out.println(i+" "+freq[i]);
            if(freq[i]*i+count>=(arr.length/2))
                return (int)Math.ceil((arr.length/2 -count)*1.0/i) + sum;
            
            count=  count + freq[i]*i;
            sum =sum + freq[i];
        }
        
        return count;
    }
}