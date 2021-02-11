class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        int ans = 0;
        while(i<arr.length-1 && arr[i]<arr[i+1])
            if(arr[i+1]>arr[ans])
                ans=i++ +1;
        
        return ans;
    }
}