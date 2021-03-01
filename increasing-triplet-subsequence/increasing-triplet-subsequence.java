class Solution {
    public boolean increasingTriplet(int[] nums) {
         
    int[] arr= new int[nums.length];
        int res=0;
        int st=0;
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
           int in =  bins(arr,0,res,nums[i]);
            arr[in]=nums[i];
            res=Math.max(res,in);
            System.out.println(res+" "+in+" "+nums[i]);
        }
        
        
        return ((res+1)>2?true:false);
        
}
    
    
    public int bins(int[] arr,int lo,int hi,int el)
    {
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            
            if(arr[mid]==el)
                return mid;
            
            if(arr[mid]<el)
                lo=mid+1;
            else
                hi=mid-1;
        }
    //    System.out.println(el)
        return lo;
    }
}