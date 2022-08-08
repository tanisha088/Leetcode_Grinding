class Solution {
    public int lengthOfLIS(int[] nums) {
       // O(N^2) APPROACH :: RES GIVES THE LARGEST LENGTH AND ANS GIVES THE ACTUAL LARGEST SEQUENCE
        /*
        int[] arr= new int[nums.length];
        String[] starr=new String[nums.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=1;
            starr[i]=Integer.toString(nums[i]);
        }
        int res=1;
        String ans="";
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    if(arr[j]+1>arr[i])
                    {
                        String m = starr[j]+" "+Integer.toString(nums[i]);
                        arr[i]=arr[j]+1;
                        starr[i]=m;
                        if(res<arr[i])
                        {
                            res=arr[i];
                            ans=m;
                        }
                    }
                }
            }
        }
        
        System.out.println(ans);
        return res;
    }
    
   */ 
    /// O(NLOGN) IS HERE
    
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
        
        
        return res+1;
        
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
