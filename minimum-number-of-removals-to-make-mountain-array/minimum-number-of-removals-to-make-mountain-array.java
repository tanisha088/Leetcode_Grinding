class Solution {
    public int minimumMountainRemovals(int[] nums) {
        
        int[] arr= new int[nums.length];
        int[] calc=new int[nums.length];
        int res=0;
        int st=0;
        arr[0]=nums[0];
        calc[0]=1;
        for(int i=1;i<nums.length;i++)
        {
           int in =  bins(arr,0,res,nums[i]);
            arr[in]=nums[i];
            calc[i]=in+1;
            res=Math.max(res,in);
        }
        
        int[] arr1 = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--)
            arr1[nums.length-i-1]=nums[i];
        
        nums = arr1;
        
        int[] arr2 = new int[nums.length];
                int[] calc2=new int[nums.length];

         res=0;
        st=0;
        arr2[0]=nums[0];
        calc2[0]=1;
     //   System.out.println(nums[0]+" "+arr1[0]);
        for(int i=1;i<nums.length;i++)
        {
           int in =  bins(arr2,0,res,nums[i]);
            arr2[in]=nums[i];
            calc2[i]=in+1;
        //    System.out.println(nums[i]+" "+in);
            res=Math.max(res,in);
        }
        
        res=0;
        for(int i=0;i<arr.length;i++)
        {
            if(calc[i]>1 && calc2[arr.length-1-i]>1)
            res=Math.max(res,calc[i]+calc2[arr.length-1-i]);
           System.out.println(calc[i]+ " "+calc2[arr.length-1-i]);
        }
        
        return nums.length-res+1;
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