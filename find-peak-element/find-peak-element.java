class Solution {
    public int findPeakElement(int[] arr) {
     int lo=0;
        int hi=arr.length-1;
        int ans=0;
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            if(mid>0 && arr[mid]<arr[mid-1])
            {
                hi=mid-1;
            }
            else
            {
                ans=Math.max(ans,mid);
                lo=mid+1;
            }
        }
        
        return ans;
    }
}








