class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
     
       int max=0;
        for(int[] i:boxTypes)
        {
            max=Math.max(max,i[1]);
        }
        
        int[] arr = new int[max+1];
        
        for(int[] i:boxTypes)
        {
            int a=i[0];
            int b=i[1];
            
            arr[b]+=a;
        }
        
        int ans=0;
        
        int totcount=0;
        
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==0)
                continue;
            
            if(totcount+arr[i]<=truckSize)
            {
                totcount+=arr[i];
                ans+=(arr[i]*i);
            }
            else
            {
                ans = ans + (i*(truckSize-totcount));
                 return ans;
            }
        }
        
        return ans;
    }
}